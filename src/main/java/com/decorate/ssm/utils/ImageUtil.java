package com.decorate.ssm.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by charles on 17/2/20.
 */
public class ImageUtil {

    public static final Map<String, String> mFileTypes = new HashMap<String, String>();
    static {
        mFileTypes.put("jpg", "FFD8FF");
        mFileTypes.put("png", "89504E47");
        mFileTypes.put("gif", "47494638");
    }

//    /**
//     * 上传图片；
//     * @param file 头像
//     * @param url 本地存储地址
//     */
//    public static String upload(byte[] file,String url) throws IOException {
//
//        HttpPost httpPost=new HttpPost(url);
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        EntityBuilder entityBuilder=EntityBuilder.create();
//        entityBuilder.setBinary(file);
//        entityBuilder.setContentType(ContentType.create("jpg"));
//        HttpEntity httpEntity=entityBuilder.build();
//
//        httpPost.setEntity(httpEntity);
//
//        ResponseHandler<String> responseHandler = httpResponse -> {
//
//            int status = httpResponse.getStatusLine().getStatusCode();
//            if (status == 200) {
//                HttpEntity entity = httpResponse.getEntity();
//                return entity != null ? EntityUtils.toString(entity) : null;
//            } else {
//
//                HttpEntity entity = httpResponse.getEntity();
//                return entity != null ? EntityUtils.toString(entity) : null;
////                throw new ClientProtocolException("check token fail: " + status);
//            }
//
//        };
//
//
//        return httpclient.execute(httpPost,responseHandler);
//
//    }

//    /**
//     * 下载
//     * @param url 本地存储地址；
//     * @return
//     * @throws IOException
//     */
//    public static InputStream download(String url) throws IOException {
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//        HttpGet httpPost=new HttpGet(url);
//        HttpResponse httpResponse=httpclient.execute(httpPost);
//
//        HttpEntity entity = httpResponse.getEntity();
//        return entity.getContent();
//    }


    /**
     * 文件后缀名检测；
     * @param fileName 文件类型；
     */
    public final static boolean suffixCheck(String fileName){
        String type=null;
        type=fileName.indexOf(".")!=-1?fileName.substring(fileName.lastIndexOf(".")+1, fileName.length()):null;
        if (type == null){
            return false;
        }
        if ((!"GIF".equals(type.toUpperCase()))&&
                (!"PNG".equals(type.toUpperCase()))&&
                (!"JPG".equals(type.toUpperCase()))) {
            return false;
        }
        return true;
    }


    /**
     * 文件转为十六进制字符串；
     */
    private final static String getFileHexString(byte[] b)
    {
        StringBuilder stringBuilder = new StringBuilder();
        if (b == null || b.length <= 0)
        {
            return null;
        }
        for (int i = 0; i < b.length; i++)
        {
            int v = b[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2)
            {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    /**
     * 获取文件的魔法数字；
     */
    private final static String getImageTypeByBytes(byte[] b)
    {
        String fileTypeHex = String.valueOf(getFileHexString(b));

        Iterator<Map.Entry<String, String>> entryIterator = mFileTypes.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String,String> entry =  entryIterator.next();
            String fileTypeHexValue = entry.getValue();
            if (fileTypeHex.toUpperCase().startsWith(fileTypeHexValue)) {
                return entry.getKey();
            }
        }
        return null;
    }

    /**
     * 通过读取文件并获取其width及height的方式，来判断判断当前文件是否图片;
     */
    private static final boolean isImage(InputStream imageStream){
        boolean flag = false;
        try
        {
            BufferedImage bufImage = ImageIO.read(imageStream);
            int width = bufImage.getWidth();
            int height = bufImage.getHeight();
            if(width==0 || height==0){
                flag = false;
            }else {
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
        }
        return flag;

    }

    /**
     * 图片检测；
     * @param file 上传的图片；
     */
    public static boolean imageCheck(MultipartFile file){
        //确认图片非空；
        if (file == null){
            return false;
        }

        //原文件名；
        String fileName=file.getOriginalFilename();

        //后缀名检测；
        if (!suffixCheck(fileName)){
            return false;
        }

        //魔术数字判断;
        byte[] fileBytes= new byte[0];
        try {
            fileBytes = file.getBytes();
        } catch (IOException e) {
            return false;
        }
        byte[] fileHeader=new byte[20];
        for (int i = 0; i < fileHeader.length; i++) {
            fileHeader[i]=fileBytes[i];
        }

        if (
                //魔术数字检测；
                getImageTypeByBytes(fileHeader)==null||
                //宽高检测；
                !isImage(new ByteArrayInputStream(fileBytes))) {
            return false;
        }

        return true;
    }

}

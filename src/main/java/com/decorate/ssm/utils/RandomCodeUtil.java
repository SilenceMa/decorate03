package com.decorate.ssm.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by charles on 17/2/11.
 */
public class RandomCodeUtil {
    public static String getIntRandom(int length){
        String str="";
        Random random=new Random();

        for (int i=0;i<length;i++){
            str += String.valueOf(random.nextInt(10));
        }
        return str;
    }

    public static String getStringRandom(int length){
        String str="";
        Random random=new Random();

        for (int i=0;i<length;i++){
            String charOrNum=random.nextInt(2)%2==0?"char":"num";
            if( "char".equalsIgnoreCase(charOrNum) ) {
                int temp = random.nextInt(2) % 2 == 0 ? 65 : 97;
                str += (char)(random.nextInt(26) + temp);
            } else if( "num".equalsIgnoreCase(charOrNum) ) {
                str += String.valueOf(random.nextInt(10));
            }
        }
        return str;
    }

    public static String getRandomByTime(int length){
        String timestamp=String.valueOf(TimeUtils.getTimestamp());
        String numeric=getNumber(timestamp);

        String ID=numeric+getIntRandom(length);
        return ID;
    }


    public static String getNumber(String str){
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    public static String getToken() throws Exception {
        DesUtils desUtils=new DesUtils("token");
        String timestamp=getRandomByTime(5);
        return desUtils.encrypt(timestamp);
    }
}

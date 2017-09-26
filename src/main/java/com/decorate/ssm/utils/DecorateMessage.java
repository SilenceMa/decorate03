package com.decorate.ssm.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回类用来处理返回信息
 */
public class DecorateMessage {

    /**
     * status_code 状态码 200成功 201 参数错误 等等 自定义
     * message 提示信息
     * extend 用户返回给浏览器的信息
     */
    private String status_code;
    private String message;
    private Map<String,Object> extend = new HashMap<>();

    public String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
    //请求成功
    public static DecorateMessage success(){
        DecorateMessage message = new DecorateMessage();
        message.setStatus_code(Constant.STATUS_CODE_SUCCESS);
        message.setMessage(Constant.STATUS_SUCCESS_MESSAGE);
        return message;
    }
    //请求失败
    public static DecorateMessage fail(){
        DecorateMessage message = new DecorateMessage();
        message.setStatus_code(Constant.STATUS_CODE_FAILE);
        message.setMessage(Constant.STATUS_FAILE_MESSAGE);
        return message;
    }
    //如果程序需要进行链式操作，那么程序中的方法的返回值为Class对象
    public DecorateMessage add(String key,Object value){
        this.getExtend().put(key,value);
        return this;
    }
}

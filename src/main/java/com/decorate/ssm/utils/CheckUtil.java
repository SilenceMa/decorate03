package com.decorate.ssm.utils;

import com.decorate.ssm.exception.ParameterFormatException;

/**
 * Created by charles on 17/2/28.
 */
public class CheckUtil {

    //参数长度检查；
    public static void checkLength(String parameter,int min,int max) throws ParameterFormatException {
        if (parameter.length()<min||parameter.length()>max){
            throw new ParameterFormatException();
            // TODO: 17/2/28 参数长度错误
        }
    }

    //数字格式检查；
    public static void checkNumeric(String parameter) throws ParameterFormatException {
        for (int i=0;i < parameter.length();i++){
            if (!Character.isDigit(parameter.charAt(i))){
                throw new ParameterFormatException();
                // TODO: 17/2/28 参数格式错误；
            }
        }
    }
}

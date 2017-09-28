package com.decorate.ssm.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {
    /**
     * 获取当前的时间戳
     * @return 当前时间戳
     */
    public static Timestamp getTimestamp(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return Timestamp.valueOf(dateFormat.format(date));
    }

    /**
     * 获取目标到现在过了多少时间
     * @param create_time 创建时间
     * @return
     */
    public static long getCompleteTime(Timestamp create_time){
        Date date = new Date();
        return date.getTime() - create_time.getTime();

    }

    /**
     * 判断时间是否过期
     * @param time 时间戳
     * @param times 时间段
     * @return 是否过期
     */
    public static boolean isOverTime(Timestamp time,long times){
        long duration = getCompleteTime(time);
        if (duration<=times){
            return  false;
        }
        return true;
    }

    /**
     * 获取过期期限
     * @param expiredTime 过期时间段
     * @return 过期期限
     */
    public static Timestamp getExpiredTime(long expiredTime){
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String deadline = format.format(date.getTime()+expiredTime);
        return Timestamp.valueOf(deadline);
    }

    /**
     * 获取当前日期
     * @return
     */
    public static Timestamp getDate(){
        Date date =new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return Timestamp.valueOf(format.format(date));
    }
}

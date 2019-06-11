package com.itheima.ssm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 14:55
 * @Version V1.0
 */
public class DateUtils {

    // 将字符串转换成日期
    public static Date stringToDate(String sDate,String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern); // "yyyy-MM-dd HH:mm:ss
        Date date = null;
        try {
            date = dateFormat.parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    // 将日期转换成字符串
    public static String dateToString(Date date,String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern); // "yyyy-MM-dd HH:mm:ss
        String sDate = dateFormat.format(date);
        return sDate;
    }
}

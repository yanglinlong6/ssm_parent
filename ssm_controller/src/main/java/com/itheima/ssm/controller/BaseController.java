package com.itheima.ssm.controller;

import com.itheima.ssm.utils.DateUtils;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 17:50
 * @Version V1.0
 */
public class BaseController {

    // 在访问Controller类之前，实现类型转换，springmvc提供的转换注解对象
    @InitBinder
    public void initDateBinder(WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Date.class,new PropertiesEditor(){
            /**
             * setAsText(@Nullable String text)
             *  String表示传递的一个字符串的类型，页面表单传递都是字符串的形式，String text接收页面传递的字符串
             */
            @Override
            public void setAsText(@Nullable String text) throws IllegalArgumentException {
//                SimpleDateFormat SimpleDateFormat = new SimpleDateFormat();
//                SimpleDateFormat.parse()
                Date date = DateUtils.stringToDate(text, "yyyy-MM-dd HH:mm");
                super.setValue(date); // 传递过来是一个字符串，返回是一个Date对象
            }
        });
    }
}

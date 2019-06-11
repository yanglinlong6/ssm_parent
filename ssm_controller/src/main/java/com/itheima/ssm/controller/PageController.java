package com.itheima.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName PageController
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 16:44
 * @Version V1.0
 */
@Controller
@RequestMapping(value = "/page")
public class PageController {

    // 通用跳转到WEB-INF中的页面
    @RequestMapping(value = "/{args}")
    public String mainPage(@PathVariable(value = "args") String args){
        return args;
    }

}

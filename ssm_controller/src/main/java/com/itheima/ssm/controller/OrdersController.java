package com.itheima.ssm.controller;

import com.itheima.ssm.pojo.Orders;
import com.itheima.ssm.pojo.Product;
import com.itheima.ssm.service.OrdersService;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 15:52
 * @Version V1.0
 */
@Controller
@RequestMapping(value = "/orders")
public class OrdersController  {

    @Autowired
    OrdersService ordersService;

    @Autowired
    ProductService productService;

    // 查询所有
    @RequestMapping(value = "/findAll",method = {RequestMethod.GET})
    public String findAll(Model model){
        List<Orders> list = ordersService.findAll();
        model.addAttribute("list",list);
        return "order-list";
    }

    // 跳转到新增订单的页面
    @RequestMapping(value = "/add",method = {RequestMethod.GET})
    public String add(Model model){
        List<Product> pList = productService.findAllProduct();
        model.addAttribute("pList",pList);
        return "order-add";
    }

    // 保存
    @RequestMapping(value = "/save")
    public String save(Orders orders){
        ordersService.save(orders);
        return "redirect:/orders/findAll";
    }

}

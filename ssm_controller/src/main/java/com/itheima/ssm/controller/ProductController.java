package com.itheima.ssm.controller;

import com.itheima.ssm.pojo.Product;
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
@RequestMapping(value = "/product")
public class ProductController  {

    @Autowired
    ProductService productService;

    // 查询所有
    @RequestMapping(value = "/findAll",method = {RequestMethod.GET})
    public String findAll(Model model){
        List<Product> list = productService.findAllProduct();
        model.addAttribute("list",list);
        return "product-list";
    }

    // 新增
    @RequestMapping(value = "/save",method = {RequestMethod.POST})
    public String save(Product product){
        int row = productService.save(product);
        System.out.println(row);
        return "redirect:/product/findAll";
    }

    // 跳转到编辑页面，findById
    @RequestMapping(value = "/findById",method = {RequestMethod.GET})
    public String findById(Integer id,Model model){
        Product product = productService.findById(id);
        model.addAttribute("product",product);
        return "product-update";
    }

    // 更新
    @RequestMapping(value = "/update",method = {RequestMethod.POST})
    public String update(Product product){
        int row = productService.update(product);
        System.out.println(row);
        return "redirect:/product/findAll";
    }

    // 删除
    @RequestMapping(value = "/delete",method = {RequestMethod.GET})
    public String delete(Integer id){
        productService.delete(id);
        return "redirect:/product/findAll";
    }
}

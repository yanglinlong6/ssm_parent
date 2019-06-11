package com.itheima.ssm.test;

import com.itheima.ssm.pojo.Product;
import com.itheima.ssm.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 项目名:ssm_parent
 * 包名: com.itheima.ssm.test
 * 作者: Yanglinlong
 * 日期: 2019/6/8 22:01
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-tx.xml")
public class TestService {
    @Autowired
    ProductService productService;

    // 新增
    @Test
    public void saveProduct(){
        Product product = new Product();
        product.setProductName("广州一日游");
        product.setProductNum("itcast-007");
        product.setCityName("广州");
        product.setDepartureTime(new Date());
        product.setProductPrice(2500d);
        product.setProductDesc("广州是个好城市");
        product.setProductStatus(0);
        productService.save(product);
    }

    // 查询
    @Test
    public void findAllProduct(){
        List<Product> list = productService.findAllProduct();
        for (Product product : list) {
            System.out.println(product);
        }
    }

}

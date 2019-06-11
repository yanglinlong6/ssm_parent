package com.itheima.ssm.test;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 15:17
 * @Version V1.0
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-mybatis.xml"})
public class TestMybatis {

    @Autowired
    ProductDao productDao;

    // 新增
    @Test
    public void save(){
        Product product = new Product();
        product.setProductName("深圳一日游");
        product.setDepartureTime(new Date());
        product.setCityName("深圳湾口岸");
        product.setProductNum("itcast-005");
        product.setProductDesc("深圳是个不错的城市");
        product.setProductPrice(1000d);
        product.setProductStatus(1);//1表示可用
        productDao.save(product); // mybatis事务自动提交
    }

    // 查询
    @Test
    public void findAll(){
        List<Product> list = productDao.findAll();
        for (Product product : list) {
            System.out.println(product);
        }
    }
}

package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ProductDao;
import com.itheima.ssm.pojo.Product;
import com.itheima.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 15:41
 * @Version V1.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;
    @Override
    public List<Product> findAllProduct() {
        return productDao.findAll();
    }
    @Override
    public int save(Product product) {
        return productDao.save(product);
    }
    @Override
    public Product findById(Integer id) {
        return productDao.findById(id);
    }
    @Override
    public int update(Product product) {
        return productDao.update(product);
    }
    @Override
    public void delete(Integer id) {
        productDao.delete(id);
    }

}

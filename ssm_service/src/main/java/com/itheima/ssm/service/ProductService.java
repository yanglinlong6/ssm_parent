package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAllProduct();

    public int save(Product product);

    Product findById(Integer id);

    int update(Product product);

    void delete(Integer id);

}

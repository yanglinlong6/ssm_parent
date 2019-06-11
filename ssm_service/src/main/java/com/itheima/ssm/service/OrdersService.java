package com.itheima.ssm.service;

import com.itheima.ssm.pojo.Orders;

import java.util.List;

public interface OrdersService {

    List<Orders> findAll();

    void save(Orders orders);
}

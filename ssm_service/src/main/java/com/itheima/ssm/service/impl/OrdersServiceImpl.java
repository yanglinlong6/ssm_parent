package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.OrdersDao;
import com.itheima.ssm.pojo.Orders;
import com.itheima.ssm.service.OrdersService;
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
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersDao ordersDao;
    @Override
    public List<Orders> findAll() {
        return ordersDao.findAll();
    }
    @Override
    public void save(Orders orders) {
        ordersDao.save(orders);
    }
}

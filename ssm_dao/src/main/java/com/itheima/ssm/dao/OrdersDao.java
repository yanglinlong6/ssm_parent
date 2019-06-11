package com.itheima.ssm.dao;

import com.itheima.ssm.pojo.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// 加与不加没啥影响
public interface OrdersDao {

    @Select(value = "SELECT o.id AS oid,o.orderNum,o.orderTime,o.peopleCount,o.orderDesc,o.payType,o.orderStatus,p.* FROM orders o,product p WHERE o.productId = p.id")
    @Results(id="ordersMap",value = {
            @Result(id=true,column = "oid",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "id",property = "product.id"),
            @Result(column = "productNum",property = "product.productNum"),
            @Result(column = "productName",property = "product.productName"),
            @Result(column = "cityName",property = "product.cityName"),
            @Result(column = "departureTime",property = "product.departureTime"),
            @Result(column = "productPrice",property = "product.productPrice"),
            @Result(column = "productDesc",property = "product.productDesc"),
            @Result(column = "productStatus",property = "product.productStatus")
    })
    List<Orders> findAll();

    @Insert(value = "insert into orders(orderNum,orderTime,peopleCount,orderDesc,payType,orderStatus,productId) values (#{orderNum},#{orderTime},#{peopleCount},#{orderDesc},#{payType},#{orderStatus},#{product.id})")
    void save(Orders orders);
}

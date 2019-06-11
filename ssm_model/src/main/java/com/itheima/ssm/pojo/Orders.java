package com.itheima.ssm.pojo;

import java.util.Date;

/**
 * @ClassName Product
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 15:01
 * @Version V1.0
 */
public class Orders {
    private Integer id;
    private String orderNum;
    private Date orderTime;
    private Integer peopleCount;
    private String orderDesc;
    private Integer payType;  // 支付方式，0微信，1支付宝，2其他
    private Integer orderStatus; // 0表示未支付，1表示已支付

    //private String `productId` INT, 外键
    // 一个订单对应一个产品
    private Product product; // 多表查询的时候，对象.属性，获取值

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", peopleCount=" + peopleCount +
                ", orderDesc='" + orderDesc + '\'' +
                ", payType=" + payType +
                ", orderStatus=" + orderStatus +
                ", product=" + product +
                '}';
    }
}

package com.itheima.ssm.pojo;

import com.itheima.ssm.utils.DateUtils;

import java.util.Date;

/**
 * @ClassName Product
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/6/8 15:01
 * @Version V1.0
 */
public class Product {
    private Integer id;
    private String productNum;
    private String productName;
    private String cityName;
    // springmvc进行默认类型转换的时候，支持的日期格式是：yyyy/MM/dd HH:mm:ss
    // @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") // 推荐使用
    private Date departureTime;
    private Double productPrice;
    private String productDesc;
    private Integer productStatus;// 产品状态，0是禁用，1是可用

    // 定义字符串的日期
    private String departureTimeStr;

    // 定义产品状态是禁用开始开启
    private String productStatusStr;

    public String getProductStatusStr() {
        if(productStatus==null){
            return "";
        }
        else{
            productStatusStr = productStatus==0?"禁用":"开启";
        }
        return productStatusStr;
    }

    public void setProductStatusStr(String productStatusStr) {
        this.productStatusStr = productStatusStr;
    }

    public String getDepartureTimeStr() {
        if(departureTime==null){
            return "";
        }else{
            departureTimeStr = DateUtils.dateToString(departureTime, "yyyy-MM-dd HH:mm");
        }
        return departureTimeStr;
    }

    public void setDepartureTimeStr(String departureTimeStr) {
        this.departureTimeStr = departureTimeStr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", departureTime=" + departureTime +
                ", productPrice=" + productPrice +
                ", productDesc='" + productDesc + '\'' +
                ", productStatus=" + productStatus +
                '}';
    }
}

package com.itheima.ssm.dao;

import com.itheima.ssm.pojo.Product;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // 加与不加没啥影响
public interface ProductDao {

    @Select(value = "select * from product")
    public List<Product> findAll();

    @Insert(value = "insert into product(id,productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values (#{id},#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public int save(Product product);

    @Select(value = "select * from product where id = #{id}")
    Product findById(Integer id);

    @Update(value = "update product set productNum=#{productNum},productName=#{productName},cityName=#{cityName},departureTime=#{departureTime},productPrice=#{productPrice},productDesc=#{productDesc},productStatus=#{productStatus}  where id = #{id}")
    int update(Product product);

    @Delete(value = "delete from product where id = #{id}")
    void delete(Integer id);

}

package com.cook.baolema.dao;

import com.cook.baolema.pojo.OrderInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderInfoDao {
    @Select("select * from tb_order")
    List<OrderInfo> selectAll();

    @Select("select * from tb_order where orderID=#{id}")
    OrderInfo selectByID(Integer id);

    @Insert("insert into tb_order values (null,#{customerID},#{status},#{userRatings},#{totalAmount},#{createdTime},#{chefID})")
    int save(OrderInfo newOrderInfo);

    @Update("update tb_order set customerID=#{customerID},status=#{status},userRatings=#{userRatings},totalAmount=#{totalAmount},createdTime=#{createdTime},chefID=#{chefID} where orderID=#{orderID}")
    int update(OrderInfo newOrderInfo);

    @Delete("delete from tb_order where orderID=#{id}")
    int deleteByID(Integer id);
}

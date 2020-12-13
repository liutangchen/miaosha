package com.imooc.miaosha.dao;

import com.imooc.miaosha.domain.MiaoshaOrder;
import com.imooc.miaosha.domain.OrderInfo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface OrderDao {

    @Select("select * from miaosha_order where user_id = #{userId} and goods_id = #{goodsId}")
    MiaoshaOrder getMiaoshaOrderByUserIdGoodsId(@Param("userId") Long userId, @Param("goodsId") Long goodsId);

    @Insert("insert into order_info(user_id, goods_id, goods_name, goods_count, goods_price, order_channel, status, create_date) values ("
            + "#{userId},#{goodsId},#{goodsName},#{goodsCount},#{goodsPrice},#{orderChannel},#{status},#{createDate})")
    @Options(useGeneratedKeys=true, keyProperty="id")  // //添加该行，orderInfo对象中的id将被自动设置
    void insert(OrderInfo orderInfo);

    @Insert("insert into miaosha_order(user_id, order_id, goods_id) values (#{userId},#{orderId},#{goodsId})")
    void insertMiaoshaOrder(MiaoshaOrder miaoshaOrder);
}

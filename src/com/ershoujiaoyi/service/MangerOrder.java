package com.ershoujiaoyi.service;

import com.ershoujiaoyi.poju.Order;

import java.util.Date;
import java.util.List;

public interface MangerOrder {
    //新建订单
    int addOrder(Integer num, Integer wuId, Integer memId, Integer buyerId);
    //修改订单
    int refreshOrder(Integer buyerId, Integer num, Integer orderId);
    //卖家查询订单
    Order memberQueryOrder(Integer memId, Integer wuId);
    //买家查询订单
    List<Order> buyerQueryOrder(Integer buyerId, Integer orderId);
    //
}

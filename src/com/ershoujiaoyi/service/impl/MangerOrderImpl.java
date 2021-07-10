package com.ershoujiaoyi.service.impl;

import com.ershoujiaoyi.dao.OrderDao;
import com.ershoujiaoyi.dao.impl.OrderDaoImpl;
import com.ershoujiaoyi.poju.Order;
import com.ershoujiaoyi.service.MangerOrder;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MangerOrderImpl implements MangerOrder {
    OrderDao orderDao = new OrderDaoImpl();
    @Override
    public int addOrder(Integer num, Integer wuId, Integer memId, Integer buyerId) {
        if (num>0 && wuId >0 && memId>0 && buyerId>0){
            return orderDao.insertOrder(num,new Date(new java.util.Date().getTime()),wuId,memId);
        }
        return 0;
    }

    @Override
    public int refreshOrder(Integer buyerId, Integer num, Integer orderId) {
        if (buyerId>0 && num >0 && orderId>0){
            return orderDao.updateOrder4Buyer(num,new Date(new java.util.Date().getTime()),orderId,buyerId);
        }
        return 0;
    }

    @Override
    public Order memberQueryOrder(Integer memId, Integer wuId) {
        // 涉及多表查询
        // orderDao.queryOrder4Member();
        return null;
    }

    @Override
    public List<Order> buyerQueryOrder(Integer buyerId, Integer orderId) {
        if (orderId>0){
            return orderDao.queryOrder4Buyer(buyerId);
        }
        return null;
    }
}

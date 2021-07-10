package com.ershoujiaoyi.dao;

import com.ershoujiaoyi.poju.Order;

import java.sql.Date;
import java.util.List;

public interface OrderDao {
    //# 买家新建订单
    //insert into t_order('id', num, 'creatdate', 'wuid', 'buyid');
    int insertOrder(Integer num, Date creatTime, Integer WuPinId, Integer buyerId);
    //# 买家修改订单
    //update t_order set num=num, date='date' where t_order='id' and t_order.buyerid='buyerid';
    int updateOrder4Buyer(Integer num, Date ModifiedTime, Integer orderId, Integer buyerId);
    //# 顾客查询订单
    //select * from t_order where buyid='buyid'
    List<Order> queryOrder4Buyer(Integer buyId);
    //# 卖家查询订单
    //select * from t_order where id in ( select t_wu.id from t_wu where menid='memid' );
    List<Order> queryOrder4Member(Integer wuPinId, Integer memId);
    //查询一个订单
    Order queryOneOrder(Integer OrderId);
}

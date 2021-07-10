package com.ershoujiaoyi.dao.impl;

import com.ershoujiaoyi.dao.OrderDao;
import com.ershoujiaoyi.poju.Order;

import java.sql.Date;
import java.util.List;

public class OrderDaoImpl extends BaseDaoImpl implements OrderDao {
    //# 买家新建订单
    //insert into t_order('Ono', Onumber, 'Oredate', 'WID', 'MID');
    @Override
    public int insertOrder(Integer num, Date creatTime, Integer wuId, Integer buyerId) {
        String sql = "insert into ERSHOU.t_ORDER(`Onumber`,`Oredate`,`Wid`,`Mid`) values(?, ?, ?, ?)";
        return update(sql, num, creatTime, wuId, buyerId);
    }

    //# 买家修改订单
    //update t_order set Ono=num, Oredate='date' where t_order='id' and t_order.buyerid='buyerid';
    @Override
    public int updateOrder4Buyer(Integer num, Date ModifiedTime, Integer orderId, Integer buyerId) {
        String sql = "update ERSHOU.t_ORDER set Onumber = ?, Oredate = ? where ERSHOU.t_ORDER.Ono=? and ERSHOU.t_ORDER.Mid=?";
        return update(sql, num, ModifiedTime, orderId, buyerId);
    }

    //# 顾客查询订单
    //select * from t_order where buyid='buyid'
    @Override
    public List<Order> queryOrder4Buyer(Integer buyId) {
        String sql = "select * from ERSHOU.t_ORDER where Mid = ?";
        return queryList(sql, Order.class, buyId);
    }

    //# 卖家查询订单
    //select * from t_order where id in ( select t_wu.id from t_wu where menid='memid' );
    @Override
    public List<Order> queryOrder4Member(Integer wuPinId, Integer memId) {
        /**
         *  多表查询
         */
        String sql = "select * from ERSHOU.t_ORDER where Ono in ( select ERSHOU.t_WU.Wid from ERSHOU.t_WU where Mid = ?)";
        return null;
    }

    //查询一个订单
    @Override
    public Order queryOneOrder(Integer orderId) {
        String sql = "select * from ERSHOU.t_ORDER where Ono = ?";
        return queryOne(sql, Order.class, orderId);
    }
}

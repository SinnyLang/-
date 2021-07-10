package com.ershoujiaoyi.dao;

import com.ershoujiaoyi.poju.WuPin;

import java.sql.Date;
import java.util.List;

public interface WuPinDao {
    //# 会员放置二手物品
    //insert into t_wu(id, 'type', discribe', much, 'info', 'date', 'memid', num, 'stauts', 'adminid');
    int updateWuPin(Integer WuPinId, String type, String description, Double price, String info,
                    Date time, Integer memId, Integer num, String status, Integer adminId);
    //# 管理修改订单状态
    //update t_wu set status=num, adminid='adminid' where t_wu.id='id';
    int updateWuPinStatus(String stats, Integer adminId, Integer WuPinId);
    //# 会员修改二手物品数据
    //update t_wu set num=num, info='info', date='date' where t_wu.id='id';
    int updateWuPinNum(Integer num, String info, Date time, Integer WuPinId, Integer memId);
    //# 管理查询管理的二手物品
    //select * from t_wu where adminid='adminid';
    List<WuPin> queryWuPin4Admin(Integer adminId);
    //# 卖家查询物品
    //select * from t_wu where memid ='memid';
    List<WuPin> queryWuPin4Member(Integer memId);
    //# 按时间顺序查看所有二手物品
    //select * from t_wu order by t_wu.date desc;
    List<WuPin> queryAll();
    //查询单个物品
    WuPin queryOneWuPin(Integer WuPinId);


}

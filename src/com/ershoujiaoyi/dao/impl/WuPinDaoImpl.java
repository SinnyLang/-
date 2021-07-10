package com.ershoujiaoyi.dao.impl;

import com.ershoujiaoyi.dao.WuPinDao;
import com.ershoujiaoyi.poju.WuPin;

import java.sql.Date;
import java.util.List;

public class WuPinDaoImpl extends BaseDaoImpl implements WuPinDao {
    //# 会员放置二手物品
    //insert into t_wu(id, 'type', discribe', much, 'info', 'date', 'memid', num, 'stauts', 'adminid');
    @Override
    public int updateWuPin(Integer WuPinId, String type, String description, Double price, String info,
                               Date time,  Integer memId, Integer num, String stats, Integer adminId) {
        String sql = "insert into ERSHOU.t_WU(`Wkind`, `Wdescribe`, `Wprice`, `Winformation`, `Wdate`, `Wstate`, `Wnumber`, `Mid`) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?)";
        return update(sql, type, description, price, info, time, stats, num, memId);
    }

    //# 管理修改订单状态
    //update t_wu set Wstatus=num, aid='adminid' where t_wu.Wid='id';
    @Override
    public int updateWuPinStatus(String stats, Integer adminId, Integer WuPinId) {
        String sql = "update ERSHOU.t_WU set Wstate = ?,Aid = ? where t_WU.Wid = ?";
        return update(sql, stats, adminId, WuPinId);
    }

    //# 会员修改二手物品数据
    //update t_wu set WnumBER=num, Winformation='info', Wdate='date' where t_wu.Wid='id';
    @Override
    public int updateWuPinNum(Integer num, String info, Date time, Integer WuPinId, Integer memId) {
        String sql = "update ERSHOU.t_WU set Wnumber = ?, Winformation = ?, Wdate = ? " +
                "where ERSHOU.t_WU.Wid = ? and ERSHOU.t_WU.Mid=?";
        return update(sql, num, info, time, WuPinId, memId);
    }

    //# 管理查询管理的二手物品
    //select * from t_wu where Aid='adminid';
    @Override
    public List<WuPin> queryWuPin4Admin(Integer adminId) {
        String sql = "select * from ERSHOU.t_WU where Aid = ?";
        return queryList(sql, WuPin.class, adminId);
    }

    //# 卖家查询物品
    //select * from t_wu where Mid ='memid';
    @Override
    public List<WuPin> queryWuPin4Member(Integer memId) {
        String sql = "select * from ERSHOU.t_WU where Mid = ?";
        return queryList(sql, WuPin.class, memId);
    }

    //# 按时间顺序查看所有二手物品
    //select * from t_wu order by t_wu.Wdate desc;
    @Override
    public List<WuPin> queryAll() {
        String sql = "SELECT * FROM ershou.t_wu ORDER BY t_wu.Wdate DESC";
        return queryList(sql, WuPin.class);
    }

    //查询单个物品
    @Override
    public WuPin queryOneWuPin(Integer WuPinId) {
        String sql ="select * from ERSHOU.t_WU where Wid = ?";
        return queryOne(sql, WuPin.class, WuPinId);
    }
}

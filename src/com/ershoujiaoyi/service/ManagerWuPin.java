package com.ershoujiaoyi.service;

import com.ershoujiaoyi.poju.WuPin;

import java.util.List;

public interface ManagerWuPin {
    //修改物品状态
    int refreshStatus(String status, Integer adminId, Integer wuId);
    //会员管理物品信息
    int refreshWuPinInfo(int num, String info, Integer wuId, Integer memId);
    //新增物品
    int addWuPin(String type, String description, Double price, String info, Integer memId, Integer num);
    //查寻管理员管理的物品
    List<WuPin> queryAll4Admin(Integer adminId);
    //查询一个二手物品
    List<WuPin> queryOneWuPin(Integer WuPinId);
    //查询所有物品
    List<WuPin> queryAll(Integer memId);
    //查所有物品
    List<WuPin> queryAll();
}

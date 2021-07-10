package com.ershoujiaoyi.service.impl;

import com.ershoujiaoyi.dao.WuPinDao;
import com.ershoujiaoyi.dao.impl.WuPinDaoImpl;
import com.ershoujiaoyi.poju.WuPin;
import com.ershoujiaoyi.service.ManagerWuPin;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MangerWuPinImpl implements ManagerWuPin {
    WuPinDao wuPinDao = new WuPinDaoImpl();
    @Override
    public int refreshStatus(String status, Integer adminId, Integer wuId) {
        if (status.length()<=20 && adminId > 0 && wuId > 0){
            return wuPinDao.updateWuPinStatus(status,adminId,wuId);
        }
        return 0;
    }

    @Override
    public int refreshWuPinInfo(int num, String info, Integer wuId, Integer memId) {
        if (num>=0 && info.length()<=10 && wuId>0 && memId>0){
            return wuPinDao.updateWuPinNum(num, info,new Date(new java.util.Date().getTime()),wuId,memId);
        }
        return 0;
    }

    @Override
    public int addWuPin(String type, String description, Double price, String info, Integer memId, Integer num) {
        if (type.length() <= 6 && description.length() <= 60 && price > 0 && info.length() <= 10 && memId > 0 && num >0){
           return wuPinDao.updateWuPin(1, type,description,price,info,new Date(new java.util.Date().getTime()),memId,num,"销售中",null);
        }
        return 0;
    }

    @Override
    public List<WuPin> queryAll4Admin(Integer adminId) {
        if (adminId>0){
            return wuPinDao.queryWuPin4Admin(adminId);
        }
        return null;
    }

    @Override
    public List<WuPin> queryOneWuPin(Integer WuPinId) {
        if (WuPinId > 0){
            List<WuPin> wuPins = new ArrayList<>();
            wuPins.add(wuPinDao.queryOneWuPin(WuPinId));
            return wuPins;
        }
        return null;
    }

    @Override
    public List<WuPin> queryAll(Integer memId) {
        if (memId>0){
            return wuPinDao.queryWuPin4Member(memId);
        }else if (memId.equals("")){
            return queryAll();
        }
        return null;
    }

    @Override
    public List<WuPin> queryAll() {
        return wuPinDao.queryAll();
    }
}

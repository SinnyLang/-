package com.ershoujiaoyi.junit.Dao;

import com.ershoujiaoyi.dao.impl.WuPinDaoImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class WuPinDaoImplTest {
    static WuPinDaoImpl wuPinDao;
    @BeforeClass
    public static void setBeforeClass(){
        wuPinDao = new WuPinDaoImpl();
    }
    @Test
    public void updateWuPin() {
        System.out.println(wuPinDao.updateWuPin(
                0, "小说", "very good!!!", 65.6,
                "里面的故事很精彩", new Date(new java.util.Date().getTime()),
                1, 3, "售卖中", null
        ));
        System.out.println(wuPinDao.updateWuPin(
                0, "鸡蛋", "好吃不贵，美味加倍!!!", 65.6,
                "好吃！", new Date(new java.util.Date().getTime()),
                1, 10, "售卖中", null
        ));
        System.out.println(wuPinDao.updateWuPin(
                0, "球", "一个圆球!!!", 65.6,
                "给猫玩的", new Date(new java.util.Date().getTime()),
                2, 1, "售卖中", null
        ));
    }

    @Test
    public void updateWuPinStatus() {
        System.out.println(wuPinDao.updateWuPinStatus("下架", 101, 1));
        System.out.println(wuPinDao.updateWuPinStatus("热卖中", 101, 2));
        System.out.println(wuPinDao.updateWuPinStatus("管理员强力推荐", 102, 3));
    }

    @Test
    public void updateWuPinNum() {
        System.out.println(wuPinDao.updateWuPinNum(10, "狗血的剧情！", new Date(new java.util.Date().getTime()),
                1, 1));
        System.out.println(wuPinDao.updateWuPinNum(10, "猫猫掌中宝！", new Date(new java.util.Date().getTime()),
                3, 10));
    }

    @Test
    public void queryWuPin4Admin() {
        System.out.println(wuPinDao.queryWuPin4Admin(101));
        System.out.println(wuPinDao.queryWuPin4Admin(102));
        System.out.println(wuPinDao.queryWuPin4Admin(103));
    }

    @Test
    public void queryWuPin4Member() {
        System.out.println(wuPinDao.queryWuPin4Member(1));
        System.out.println(wuPinDao.queryWuPin4Member(2));
        System.out.println(wuPinDao.queryWuPin4Member(10));
    }

    @Test
    public void queryAll() {
        System.out.println(wuPinDao.queryAll());
    }

    @Test
    public void queryOneWuPin() {
        System.out.println(wuPinDao.queryOneWuPin(1));
        System.out.println(wuPinDao.queryOneWuPin(10));
    }
}
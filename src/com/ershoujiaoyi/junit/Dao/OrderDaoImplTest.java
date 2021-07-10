package com.ershoujiaoyi.junit.Dao;

import com.ershoujiaoyi.dao.impl.OrderDaoImpl;
import com.ershoujiaoyi.poju.Order;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

public class OrderDaoImplTest {
    static OrderDaoImpl orderDao;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        orderDao = new OrderDaoImpl();
    }

    @Test
    public void insertOrder() {
        System.out.println(orderDao.insertOrder( 6,
                new Date(new java.util.Date().getTime()), 1, 3));
        System.out.println(orderDao.insertOrder(10,
                new Date(new java.util.Date().getTime()), 10, 3));
        System.out.println(orderDao.insertOrder( 6,
                new Date(new java.util.Date().getTime()), 2, 3));
        System.out.println(orderDao.insertOrder(10,
                new Date(new java.util.Date().getTime()), 3, 10));
    }

    @Test
    public void updateOrder4Buyer() {
        System.out.println(orderDao.updateOrder4Buyer(10,
                new Date(new java.util.Date().getTime()), 3, 3));
    }

    @Test
    public void queryOrder4Buyer() {
        List<Order> orders = orderDao.queryOrder4Buyer(3);
        System.out.println(orders);
    }

    @Test
    public void queryOrder4Member() {
        /**
         *  多表查询
         */
    }

    @Test
    public void queryOneOrder() {
        System.out.println(orderDao.queryOneOrder(1));
    }
}
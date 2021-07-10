package com.ershoujiaoyi.junit.service;

import com.ershoujiaoyi.service.MangerOrder;
import com.ershoujiaoyi.service.impl.MangerOrderImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class MangerOrderImplTest {

    static MangerOrder mangerOrder = new MangerOrderImpl();
    @Test
    public void addOrder() {
        System.out.println(mangerOrder.addOrder(99,6,2,4));
    }

    @Test
    public void refreshOrder() {
    }

    @Test
    public void memberQueryOrder() {
    }

    @Test
    public void buyerQueryOrder() {
    }
}
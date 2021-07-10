package com.ershoujiaoyi.junit.service;

import com.ershoujiaoyi.service.MangerMember;
import com.ershoujiaoyi.service.impl.MangerMemberImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class MangerMemberImplTest {
    static MangerMember mangerMember = new MangerMemberImpl();

    @Test
    public void addMember() {
        System.out.println(mangerMember.addMember("嘿嘿嘿", "13757070697"));
    }
}
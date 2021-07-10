package com.ershoujiaoyi.junit.Dao;

import com.ershoujiaoyi.dao.impl.MemberDaoImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class MemberDaoImplTest {
    static MemberDaoImpl memberDao;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        memberDao = new MemberDaoImpl();
    }
    @Test
    public void insertMember() {
        System.out.println(memberDao.insertMember("", "小明", "123123123" , new Date(new java.util.Date().getTime())));
        System.out.println(memberDao.insertMember("", "小a", "123-123123" , new Date(new java.util.Date().getTime())));
        System.out.println(memberDao.insertMember("", "a1", "123-123-1239" , new Date(new java.util.Date().getTime())));
    }

    @Test
    public void queryOneMember() {
        System.out.println(memberDao.queryOneMember(1, "小明"));
        System.out.println(memberDao.queryOneMember(1, "a"));
        System.out.println(memberDao.queryOneMember(123,"asdf"));
    }
}
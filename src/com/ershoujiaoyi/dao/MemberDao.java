package com.ershoujiaoyi.dao;

import com.ershoujiaoyi.poju.Member;

import java.sql.Date;

public interface MemberDao {
    //# 注册会员
    //insert into t_menber('id', 'name', 'contact', 'logindate');
    int insertMember(String memId, String name, String contact, Date loginData);
    //查询单个会员
    Member queryOneMember(Integer memId, String name);
    /**
     //查询多个会员
     List<Member> queryMembersByName(String name);
    List<Member> queryMembersByContact(String contact);
    List<Member> queryMembersByNameAndContact(String name, String contact);
     */
}

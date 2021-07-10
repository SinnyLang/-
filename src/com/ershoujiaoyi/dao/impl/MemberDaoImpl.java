package com.ershoujiaoyi.dao.impl;

import com.ershoujiaoyi.dao.MemberDao;
import com.ershoujiaoyi.poju.Member;

import java.sql.Date;

public class MemberDaoImpl extends BaseDaoImpl implements MemberDao {
    //# 注册会员
    //insert into t_menber('id', 'name', 'contact', 'logindate');
    @Override
    public int insertMember(String memId, String name, String contact, Date loginData) {
        String sql = "insert into ERSHOU.t_MEMBER(`Mname`,`Mphonenumber`,`Mdate`) values (?,?,?)";
        return update(sql, name, contact, loginData);
        // 1 表示成功
    }

    //查询单个会员
    @Override
    public Member queryOneMember(Integer memId, String name) {
        String sql = "select * from ERSHOU.t_MEMBER where Mid=? and Mname=?";
        return queryOne(sql, Member.class, memId, name);
    }
}

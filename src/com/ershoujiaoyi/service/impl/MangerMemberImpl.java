package com.ershoujiaoyi.service.impl;

import com.ershoujiaoyi.dao.MemberDao;
import com.ershoujiaoyi.dao.impl.MemberDaoImpl;
import com.ershoujiaoyi.poju.Member;
import com.ershoujiaoyi.service.MangerMember;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MangerMemberImpl implements MangerMember {
    // 创建一个Dao查询对象
    MemberDao memberDao = new MemberDaoImpl();

    /**
     * 添加用户
     * @param name 用户名1…4字符
     * @param contact 联系方式6…20字符
     * @return 添加结果 1表示成功 -1表示失败
     */
    @Override
    public int addMember(String name, String contact) {
        if (!name.equals("") && contact.length() > 5) {
            if (name.length() <= 4 && contact.length() <= 20) {
                return memberDao.insertMember("0", name, contact, new Date(new java.util.Date().getTime()));
            }
        }
        return -1;
    }

    @Override
    public List<Member> queryByMemIdAndName(Integer memId, String name) {
        if (!name.equals("") && !memId.toString().equals("")){
            List<Member> members = new ArrayList<Member>();
            members.add(memberDao.queryOneMember(memId, name));
            return members;
        }
        return null;
    }

    @Override
    public List<Member> queryMembersByNameOrContact(String name, String contact) {

        return null;
    }

}

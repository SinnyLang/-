package com.ershoujiaoyi.service;

import com.ershoujiaoyi.poju.Member;

import java.util.List;

public interface MangerMember {
    // 添加成员
    int addMember(String name, String contact);
    // 查询成员
    List<Member> queryByMemIdAndName(Integer memId, String name);
    // 查询成员
    List<Member> queryMembersByNameOrContact(String name, String contact);
}

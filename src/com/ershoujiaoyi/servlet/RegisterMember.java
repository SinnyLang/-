package com.ershoujiaoyi.servlet;

import com.ershoujiaoyi.service.MangerMember;
import com.ershoujiaoyi.service.impl.MangerMemberImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterMember" , urlPatterns = {"/register"})
public class RegisterMember extends HttpServlet {
    MangerMember mangerMember = new MangerMemberImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String contact = req.getParameter("phone");
        System.out.println(name+"|||"+contact);
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        if (mangerMember.addMember(name, contact) == 1){
            out.write("注册成功");
        }else {
            out.write("注册失败");
        }

    }
}

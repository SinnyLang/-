package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "QuerySelf", urlPatterns = {"/querySelf"})
public class QuerySelf extends HttpServlet implements MangerMemberService{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Integer memId = new Integer(req.getParameter("id"));
        String name = req.getParameter("name");
        PrintWriter out = resp.getWriter();
        out.write(mangerMember.queryByMemIdAndName(memId, name).toString());
    }
}

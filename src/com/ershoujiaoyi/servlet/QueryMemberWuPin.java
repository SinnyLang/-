package com.ershoujiaoyi.servlet;

import com.alibaba.druid.support.json.JSONUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "QueryMemberWuPin", urlPatterns = {"/myWuPin"})
public class QueryMemberWuPin extends HttpServlet implements MangerWuPinService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        Integer memId = new Integer(req.getParameter("memId"));
        out.write(mangerWuPin.queryAll(memId).toString());
        out.write(JSONUtils.toJSONString(mangerWuPin.queryAll().toString()));
    }
}

package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SetStats", urlPatterns = {"/setStats"})
public class SetStats extends HttpServlet implements MangerWuPinService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String status = req.getParameter("stats");
        Integer adminId = new Integer(req.getParameter("adminId"));
        Integer wuId = new Integer(req.getParameter("wuId"));
        PrintWriter out = resp.getWriter();
        if (mangerWuPin.refreshStatus(status, adminId, wuId) == 1){
            out.write("更新成功");
        }else {
            out.write("更新失败");
        }

    }
}

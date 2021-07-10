package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SetInformation", urlPatterns = {"/setInformation"})
public class SetInformation extends HttpServlet implements MangerWuPinService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Integer num = new Integer(req.getParameter("num"));
        String info = req.getParameter("info");
        Integer wuId = new Integer(req.getParameter("wuId"));
        Integer memId = new Integer(req.getParameter("memId"));
        PrintWriter out = resp.getWriter();
        if (mangerWuPin.refreshWuPinInfo(num, info, wuId, memId)==1){
            out.write("更新成功");
        }else {
            out.write("更新失败");
        }
    }
}

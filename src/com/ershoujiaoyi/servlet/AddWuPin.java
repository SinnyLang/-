package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddWuPin", urlPatterns = {"/addWuPin"})
public class AddWuPin extends HttpServlet implements MangerWuPinService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        String type = req.getParameter("type");
        String description = req.getParameter("description");
        Double price = new Double(req.getParameter("price"));
        String info = req.getParameter("info");
        Integer memId = new Integer(req.getParameter("mid"));
        Integer num = new Integer(req.getParameter("num"));
        PrintWriter out = resp.getWriter();
        if(mangerWuPin.addWuPin(type, description, price, info, memId, num) == 1){
            out.write("物品添加成功");
        }else {
            out.write("添加失败");
        }
    }
}

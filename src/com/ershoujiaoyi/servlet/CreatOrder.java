package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreatOrder", urlPatterns = {"/creatOrder"})
public class CreatOrder extends HttpServlet implements MangerOrderService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Integer num = new Integer(req.getParameter("num"));
        Integer wuId = new Integer(req.getParameter("wuId"));
        Integer memId = new Integer(req.getParameter("memId"));
        Integer buyerId = new Integer(req.getParameter("buyerId"));
        PrintWriter out = resp.getWriter();
        if (1 == mangerOrder.addOrder(num,wuId,memId,buyerId)){
            out.write("订单创建成功");
        }else {
            out.write("创建失败");
        }
    }
}

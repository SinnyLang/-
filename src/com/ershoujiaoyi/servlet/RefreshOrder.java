package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RefreshOrder", urlPatterns = {"/refreshOrder"})
public class RefreshOrder extends HttpServlet implements MangerOrderService{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        Integer buyerId = new Integer(req.getParameter("buyerId"));
        Integer num = new Integer(req.getParameter("num"));
        Integer orderId = new Integer(req.getParameter("orderId"));
        if (1 == mangerOrder.refreshOrder(buyerId,num,orderId)){
            out.write("订单更新成功");
        }else {
            out.write("订单更新失败");
        }
    }
}

package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "BuyerOrder", urlPatterns = {"/buyerOrder"})
public class BuyerOrder extends HttpServlet implements MangerOrderService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Integer buyerId = new Integer(req.getParameter("buyerId"));
        Integer orderId = new Integer(req.getParameter("orderId"));
        PrintWriter out = resp.getWriter();
        out.write(mangerOrder.buyerQueryOrder(buyerId,orderId).toString());
    }
}

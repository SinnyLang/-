package com.ershoujiaoyi.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "QueryOneWuPin", urlPatterns = {"/wuPin"})
public class QueryOneWuPin extends HttpServlet implements MangerWuPinService {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Integer wuPinId = new Integer(req.getParameter("wuPinId"));
        PrintWriter out = resp.getWriter();
        out.write(mangerWuPin.queryOneWuPin(wuPinId).toString());
    }
}

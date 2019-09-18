package com.babusa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WhiteGold extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("WhiteGold:: init servlet");
        // throw new ServletException("WhiteGold:: user thrown");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<title>WhiteGold</title>");
        out.println("<h1>WhiteGold</h1>");
    }
    public void destroy() {
        System.out.println("WhiteGold:: destroy servlet");
    }
}

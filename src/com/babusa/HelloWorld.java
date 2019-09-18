package com.babusa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// https://docs.oracle.com/javaee/5/tutorial/doc/bnafd.html
// https://github.com/krisjin/javaeetutorial5/tree/master/web/hello1
// https://github.com/krisjin/javaeetutorial5/tree/master/web/hello2

public class HelloWorld extends HttpServlet {

    public void init() throws ServletException {
        System.out.println("HelloWorld:: init servlet");
        // throw new ServletException("user thrown");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        /* Servlet Context - App level */
        String appCodeName = getServletContext().getInitParameter("appCodeName");
        int sessionTimeout = getServletContext().getSessionTimeout();

        /* Servlet config - servlet level */
        String servletName = getServletConfig().getServletName();
        String servletCountry = getServletConfig().getInitParameter("country");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        StringBuffer data = new StringBuffer();

        data.append("<title>HelloWorld</title>");
        data.append("<h1>Hello World</h1>");
        data.append("<h1>Get Request</h1>");
        data.append("<form action='/helloworld' method='POST'> <input type='text' name='userInput'/><input type='submit' /></form>");
        out.println(data.toString());
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        StringBuffer data = new StringBuffer();
        String userInput = req.getParameter("userInput");

        data.append("<title>HelloWorld</title>");
        data.append("<h1>Hello World</h1>");
        data.append("<h1>Post Request</h1>");
        data.append("<p>User provided value: " + userInput);

        out.println(data.toString());

    }

    public void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<title>HelloWorld</title>");
        out.println("<h1>Hello World</h1>");
        out.println("<h1>Put Request</h1>");
    }

    public void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<title>HelloWorld</title>");
        out.println("<h1>Hello World</h1>");
        out.println("<h1>Delete Request</h1>");
    }

    public void doOptions(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<title>HelloWorld</title>");
        out.println("<h1>Hello World</h1>");
        out.println("<h1>Options Request</h1>");
    }


    public void destroy() {
        System.out.println("HelloWorld:: destroy servlet");
    }
}

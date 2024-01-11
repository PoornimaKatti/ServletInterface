
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
    //If we not mention post method by default do get method invoked
    //in  <form action="web2" method="Post"> if we mention  method then post method invoke

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("HTTP Servlet");
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Output  servlet from dopost method!!!!</h1>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HTTP Servlet");
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Output  servlet from doget method!!!!</h1>");
    }
    
}

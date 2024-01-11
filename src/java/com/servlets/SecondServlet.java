
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
public class SecondServlet  extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("Generi Servlet");
        resp.setContentType("Text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>Output  servlet from generic method!!!!</h1>");
    }
    
}

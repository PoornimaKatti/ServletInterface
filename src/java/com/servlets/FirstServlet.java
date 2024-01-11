
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public  class FirstServlet implements Servlet {
    
    ServletConfig conf;
    public void init(ServletConfig conf)
    {
        this.conf=conf;
        System.out.println("Creating project ...");
        
    } 
 
    
    public void destroy()
    {
        System.out.println("going to destroy");
        
    }
    public ServletConfig getServletConfig()
    {
        return this.conf;
    }
    public String getServletInfo()
    {
        return "This servlet";
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
         System.out.println("Servicing...");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1> This is my out put from my servlet!!!!!!<h1>");
    }

    
}

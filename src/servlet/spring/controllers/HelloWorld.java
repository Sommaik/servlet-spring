/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sommaik
 */
public class HelloWorld extends HttpServlet {

    @Override
    public void doGet(
            HttpServletRequest request, 
            HttpServletResponse response)
    throws IOException, ServletException
    {
        String q = request.getQueryString();
        System.out.println(q);
        
        String name = request.getParameter("name");
        System.out.println(name);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World! "+name+"</h1>");
        out.println("</body>");
        out.println("</html>");
    }
    
    @Override
    public void doPost(
            HttpServletRequest request, 
            HttpServletResponse response)
    throws IOException, ServletException
    {
        this.doGet(request, response);
    }
    
}

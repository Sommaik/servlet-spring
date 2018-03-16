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
public class Login extends HttpServlet{
    @Override
    public void doGet(
            HttpServletRequest request, 
            HttpServletResponse response)
    throws IOException, ServletException
    {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String err = (String)request.getAttribute("error");
        
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form method='POST' action='loginService' >");
        out.println("<input type='text' name='userid' />");
        out.println("<input type='password' name='pwd' />");
        out.println("<input type='submit' name='submitbtn' value='Login' />");
        if(err != null){
            out.println("<b>"+err+"</b>");
        }
        out.println("</form>");
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

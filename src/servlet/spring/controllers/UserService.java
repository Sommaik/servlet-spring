/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sommaik
 */
public class UserService extends HttpServlet {
    
    @Override
    public void doPost(
            HttpServletRequest request, 
            HttpServletResponse response)
    throws IOException, ServletException
    {
        /**Todo
         * 1. query data from sc_user table.
         * 2. add result to array list
         * 3. set array list object to attribute name = userdata
         * 4. forward to listuser.jsp
         * 
         * SELECT user_code,
                user_age,
                user_last_name,
                user_first_name,
                user_dob
           FROM sc_user 
         */
        
        /* your code here */
        
        
        request.getRequestDispatcher("/jsp/listuser.jsp").forward(request, response);
    }
}

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
public class SaveUserService extends HttpServlet {
    @Override
    public void doPost(
            HttpServletRequest request, 
            HttpServletResponse response)
    throws IOException, ServletException
    {
        /*
        * 1 get parameter 
        * 2 insert into table
            insert into sc_user(
                user_code,
                user_age,
                user_last_name,
                user_first_name,
                user_dob,
                user_pwd)
              values (....);
          3 redirect to page /jsp/listuser2.jsp
        */
        
    }
}

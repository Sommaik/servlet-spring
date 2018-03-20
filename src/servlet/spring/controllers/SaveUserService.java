/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.spring.bean.User;

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
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://203.151.27.179:3306/train_db", 
                "train", 
                "train"
            );
            PreparedStatement pre = con.prepareStatement(
                    "insert into sc_user(user_code," +
                    " user_age," +
                    " user_last_name," +
                    " user_first_name," +
                    " user_dob," +
                    " user_pwd) values(?, ?, ?, ?, str_to_date(?, '%Y-%m-%d'), ?)"
            );
            pre.setString(1, request.getParameter("code"));
            pre.setString(2, request.getParameter("age"));
            pre.setString(3, request.getParameter("lastName"));
            pre.setString(4, request.getParameter("firstName"));
            pre.setString(5, request.getParameter("dob"));
            pre.setString(6, request.getParameter("pwd"));
            int successRow = pre.executeUpdate();
            if(successRow > 0){
                request.setAttribute("process_msg", "Save complete");
            }
            pre.close();
            con.close(); 
        }catch(Exception e){
            e.printStackTrace();
            request.setAttribute("process_msg", "Error can not save data.");
        }
        request.getRequestDispatcher("/userService").forward(request, response);
    }
}

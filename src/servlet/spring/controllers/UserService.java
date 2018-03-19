/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet.spring.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servlet.spring.bean.User;

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
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://203.151.27.179:3306/train_db", 
                "train", 
                "train"
            );
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(
                   " SELECT user_code, "+
                    " user_age, "+
                    " user_last_name, "+
                    " user_first_name, "+
                    " user_dob "+
               " FROM sc_user "
            );
            ArrayList<User> users = new ArrayList();
            while(res.next()){
                User user = new User(
                    res.getString("user_code"),
                    res.getString("user_first_name"),
                    res.getString("user_last_name"),
                    res.getInt("user_age"),
                    res.getString("user_dob")
                );
                users.add(user);
            }
            res.close();
            stmt.close();
            con.close(); 
            request.setAttribute("userdata", users);
            System.out.println(" user size = "+users.size());
        }catch(Exception e){
            e.printStackTrace();
        }
        
        request.getRequestDispatcher("/jsp/listuser2.jsp").forward(request, response);
    }
}

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
            ArrayList<Map> users = new ArrayList();
            while(res.next()){
                Map<String, String> user = new HashMap();
                user.put("code", res.getString("user_code"));
                user.put("age", res.getString("user_age"));
                user.put("fistName", res.getString("user_first_name"));
                user.put("lastName", res.getString("user_last_name"));
                user.put("dob", res.getString("user_dob"));
                users.add(user);
            }
            res.close();
            stmt.close();
            con.close(); 
            request.setAttribute("userdata", users);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        request.getRequestDispatcher("/jsp/listuser.jsp").forward(request, response);
    }
}

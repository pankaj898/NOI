package com.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import javax.servlet.RequestDispatcher;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
        String Firstname = request.getParameter("firstname");
        String Lastname = request.getParameter("lastName");
        String dob2 = request.getParameter("dob1");
        int Age = Integer.parseInt(request.getParameter("age"));
        String Address1 = request.getParameter("address1");
        String Address2 = request.getParameter("address2");
        String City = request.getParameter("city");
        String State = request.getParameter("state");
        String Country = request.getParameter("country");
        String Postalcode = request.getParameter("postalcode");

        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registers", "root", "root");
            String query = "insert into registerss(reid,firstname,lastname,dob,age,address1,address2,city,state,country,postalcode) values (NULL,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement p = con.prepareStatement(query);

            p.setString(1, Firstname);
            p.setString(2, Lastname);
            p.setString(3, dob2);
            p.setInt(4, Age);
            p.setString(5, Address1);
            p.setString(6, Address2);
            p.setString(7, City);
            p.setString(8, State);
            p.setString(9, Country);
            p.setString(10, Postalcode);
            p.executeUpdate();
            RequestDispatcher rd = request.getRequestDispatcher("displayservlet");

            rd.forward(request, response);//method may be include or forward  

        } ///request.getRequestDispatcher("/displayservlet").forward(request, response);
        catch (ClassNotFoundException | SQLException e) {
            out.println("error");
        }
    }
}

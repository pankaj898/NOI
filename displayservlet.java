/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @author AIM
 */
public class displayservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registers", "root", "root");

            String query = "select *from registerss ";
            PreparedStatement p = con.prepareStatement(query);

            ResultSet rs = p.executeQuery();
            out.println("reid\t "+"firstname  "+" lastname\t "+"\tdob\t "+"   age\t "+"  address1\t "+"  address2\t "+"    city\t "+"   state\t"+"country\t "+"        postalcode\t ");
            out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
            ResultSetMetaData rsmd = rs.getMetaData();
            
            while (rs.next()) {
              out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t     "+rs.getString(3)+"\t     "+rs.getString(4)+"\t     "+rs.getInt(5)+"\t     "+rs.getString(6)+"\t      "+rs.getString(7)+"\t      "+rs.getString(8)+"\t  "+rs.getString(9)+"\t      "+rs.getString(10)+"\t    "+rs.getString(11));
            }
          
            }

         catch (Exception e2) {

            e2.printStackTrace();

        }
    }
}

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

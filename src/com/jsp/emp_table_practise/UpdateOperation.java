package com.jsp.emp_table_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateOperation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/javapractise";
        String username="root";
        String password="root";
        String sql="UPDATE emp set emp_name='dhoni',email_address='dhoni@mail.com' WHERE id=56";
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection(url, username, password);

            Statement st=conn.createStatement();

            st.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("all good");
        }


    }
}

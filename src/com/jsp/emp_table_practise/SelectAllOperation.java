package com.jsp.emp_table_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllOperation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/javapractise";
        String username="root";
        String password="root";
        String sql="SELECT * FROM emp";
        Connection conn=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection(url, username, password);

            Statement st=conn.createStatement();

            ResultSet rs=st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1));
                System.out.println(rs.getInt(2));
                System.out.println(rs.getString(3));
                System.out.println("===================");
            }


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

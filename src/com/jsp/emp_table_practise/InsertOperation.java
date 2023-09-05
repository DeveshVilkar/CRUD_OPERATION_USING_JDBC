package com.jsp.emp_table_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/javapractise";
        String username="root";
        String password="root";
        String sql="INSERT INTO emp VALUES('dhoni',7,'dhoni@mail.com')";
        Connection conn=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn=DriverManager.getConnection(url, username, password);

            Statement st=conn.createStatement();

            st.execute(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("all good");
        }

    }

}

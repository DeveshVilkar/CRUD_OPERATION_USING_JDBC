package com.jsp.emp_table_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/javapractise";
        String username="root";
        String password="root";
        String sql="DELETE FROM emp WHERE id=7";
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
                System.out.println("all good");
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }

    }

}

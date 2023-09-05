package com.jsp.teacher_table_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete_Operation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password="root";
        String sql="DELETE FROM teacher WHERE teacher_id=2";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =DriverManager.getConnection(url,username,password);

        Statement st =con.createStatement();

        st.execute(sql);
        System.out.println("Delete Successfully");

        con.close();
    }
}

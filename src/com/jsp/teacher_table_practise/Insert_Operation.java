package com.jsp.teacher_table_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Operation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password="root";
        String sql="INSERT INTO teacher VALUES(4,'manoj','social science',1)";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =DriverManager.getConnection(url,username,password);

        Statement st =con.createStatement();

        st.execute(sql);

        System.out.println("Inserted Successfully");

        con.close();



    }
}

package com.jsp.teacher_table_practise;

import java.sql.*;

public class Selected_All_Operation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/school";
        String username="root";
        String password="root";
        String sql="SELECT * FROM teacher";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,username,password);

        Statement st =con.createStatement();

        ResultSet rs =st.executeQuery(sql);

        while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getInt(4));
            System.out.println("=============");
        }
        System.out.println("Selected Successfully");

        con.close();
    }
}

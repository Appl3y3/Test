package com.appleye.utils;

import java.sql.*;

/**
 * @author Appleye
 * @time 2019/10/16 0016 14:52
 */
public class JDBCTest {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test?useSSL=false";

    static final String USER = "Appleye";
    static final String PASSWORD = "Yosug4";

    public static void main(String[] args) {
        Connection conn = null;
//        Statement stmt = null;
        CallableStatement cstmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);

            cstmt = conn.prepareCall("call exec");
            cstmt.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (cstmt != null) cstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }




    }

}



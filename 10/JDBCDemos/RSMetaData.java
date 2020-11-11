/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author dhrutis
 */
public class RSMetaData {

    public static void main(String args[]) {

        Connection conn;
        try {
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);

            PreparedStatement pstmt = conn.prepareStatement("select * from Student");
            ResultSet rs = pstmt.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();

            System.out.println("Total columns: " + rsmd.getColumnCount());
            System.out.println("Name of 1st column: " + rsmd.getColumnName(1));
            System.out.println("Type of 1st column: " + rsmd.getColumnTypeName(1));

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dhrutis
 */
public class DBMetaData {

    public static void main(String args[]) throws SQLException {

        Connection conn = null;
        try {
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println("Driver Name: sqls " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            conn.close();
        }
    }
}

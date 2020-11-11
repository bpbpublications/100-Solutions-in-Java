/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import com.sun.rowset.CachedRowSetImpl;
import javax.sql.rowset.CachedRowSet;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dhrutis
 */
public class CachedRowSetDemo {

    public static Connection conn;

    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            //Get a connection
            conn = DriverManager.getConnection(dbURL);

            CachedRowSet crs = new CachedRowSetImpl();
            String query = "Select * from Student";
            crs.setCommand(query);
            crs.execute(conn);
            System.out.println("Connection opened and data retrieved");
            conn.close(); //close the connection
            System.out.println("Connection Closed");
            System.out.println("\nList of all students before updation");
            System.out.println("ID\t Name \tPercentage");
            while (crs.next()) {
                System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getFloat(3));

            }
            crs.first();
            crs.updateString("StudName", "Melissa");
            crs.updateRow();

            // Save the changes from rowset to the database
            System.out.println("\nConnection Reopened");
            conn = DriverManager.getConnection(dbURL);
            crs.acceptChanges(conn);

            System.out.println("\nList of all students after updation");
            crs.beforeFirst();
            System.out.println("ID\t Name \tPercentage");
            while (crs.next()) {
                System.out.println(crs.getInt(1) + "\t" + crs.getString(2) + "\t" + crs.getFloat(3));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

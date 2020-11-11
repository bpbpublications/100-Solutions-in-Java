/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dhrutis
 */
public class InsertRowExample {

    public static void main(String[] args) {
        try {
            Connection conn;

            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            //Create an updatable result set
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT StudId, StudName, Percentage FROM Student");

            rs.moveToInsertRow();
//             Set values for the new row
            rs.updateInt(1, 7);
            rs.updateString(2, "Florence");
            rs.updateFloat(3, 79.0f);
//             Commit appending of new row to the result set
            rs.insertRow();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception" + e.getMessage());
        }
    }
}

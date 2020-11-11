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
public class DeleteRowDemo {
    public static void main(String[] args) {
        try {
             Connection conn;

            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            //Create an updatable result set
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("SELECT * FROM Student");
            // Move to the last row in the result set
           rs.last();
           // Commit the delete
            rs.deleteRow();
        } catch (Exception e) {
                System.out.println("");
                e.printStackTrace();
        }
    }
}

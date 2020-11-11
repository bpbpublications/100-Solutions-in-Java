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


public class UpdateRowExample {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
             Connection conn;

            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            //Create an updatable result set
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = st.executeQuery("SELECT StudId, StudName, Percentage FROM Student where StudId=4");
            // Move to the first row in the result set
            rs.first();
            rs.updateString(2, "Patrick");
            rs.updateFloat(3, 85.6f);
            // commit the update
            rs.updateRow();
        } catch (Exception e) {
                System.out.println("");
                e.printStackTrace();
        }

    }
}

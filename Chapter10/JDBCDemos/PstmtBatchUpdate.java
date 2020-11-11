/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author dhrutis
 */
public class PstmtBatchUpdate {
   
    public static void main(String[] args) {
        try {

            Connection conn;
            //Get a connection
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            conn.setAutoCommit(false);
        
            PreparedStatement pst = conn.prepareStatement("INSERT INTO Student VALUES (?,?,?)");
            pst.setInt(1, 10);
            pst.setString(2, "Michael");
            pst.setFloat(3, 78f);
            pst.addBatch();
            
            pst.setInt(1, 11);
            pst.setString(2, "Cooper");
            pst.setFloat(3, 66.6f);
            pst.addBatch();

            int[] updateCount = pst.executeBatch();

            for (int i = 0; i <updateCount.length; i++) {
                System.out.println("Update count for statement "+ (i+1) +" is "+ updateCount[i]);
            }
            conn.commit();
            conn.setAutoCommit(true);
            pst.clearBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dhrutis
 */
public class CstmtBatchUpdate {
       
    public static void main(String[] args) {
        try {

            Connection conn;
            //Get a connection
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            conn.setAutoCommit(false);
            
            CallableStatement cst = conn.prepareCall("{call addStudent(?,?,?)}");
            // Set the query parameter values
            cst.setInt(1, 12);
            cst.setString(2, "Stewart");
            cst.setFloat(3, 69.7f);
            cst.addBatch();
            
            cst.setInt(1, 13);
            cst.setString(2, "Kevin");
            cst.setFloat(3, 55.5f);
            cst.addBatch();
            
            int[] updateCount = cst.executeBatch();

            for (int i = 0; i < updateCount.length; i++) {
                System.out.println("Update count for statement " + (i + 1) + " is " + updateCount[i]);
            }
            conn.commit();
            conn.setAutoCommit(true);
            cst.clearBatch();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

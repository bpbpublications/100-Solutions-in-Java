/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author dhrutis
 */
public class StmtBatchUpdate {
    

    public static void main(String[] args) {
        try {
            Connection conn;
            //Get a connection
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            conn.setAutoCommit(false);
            Statement st = conn.createStatement();
            st.addBatch("INSERT INTO Student VALUES (7, 'Stephen',65.8)");
            st.addBatch("INSERT INTO Student VALUES (8, 'Vereonica',77.2)");
            st.addBatch("INSERT INTO Student VALUES (9, 'Stella',58.6)");
            int[] updateCount = st.executeBatch();
            conn.commit();
            for (int i = 0; i <updateCount.length; i++) {
                System.out.println("Update count for statement "+ (i+1) +" is "+ updateCount[i]);
            }
            
            conn.setAutoCommit(true);
            st.clearBatch();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

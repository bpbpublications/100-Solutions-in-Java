/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 *
 * @author dhrutis
 */
public class TransactionExample {

    public static void main(String[] args) throws SQLException {

        Connection conn = null;
        Savepoint svpt = null;
        try {

            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            conn.setAutoCommit(false);

            PreparedStatement pst = conn.prepareStatement("INSERT INTO Student VALUES (?,?,?)");
            pst.setInt(1, 14);
            pst.setString(2, "Paul");
            pst.setFloat(3, 46.7f);
            pst.executeUpdate();

            svpt = conn.setSavepoint("SAVEPOINT_1");

            pst.setInt(1, 15);
            pst.setString(2, "Jennifer");
            pst.setFloat(3, 68.9f);
            pst.executeUpdate();

            pst.setInt(1, 16);
            pst.setString(2, "Katie");
            pst.setFloat(3, 70.5f);
            pst.executeUpdate();
//            conn.rollback(svpt);  //deliberately rolling back second statement
            conn.commit();
            pst.close();
            conn.close();

        } catch (Exception e) {
            try {
                if (svpt == null) {
                    // SQLException occurred in saving into Student table
                    conn.rollback();
                    System.out.println("JDBC Transaction rolled back successfully");
                } else {
                    // exception occurred in inserting second record into Student table
                    // we can ignore it by rollback to the savepoint
                    conn.rollback(svpt);
                    System.out.println("JDBC Transaction rolled back to savepoint");
                    //lets commit now
                    conn.commit();
                }
                e.printStackTrace();
            } catch (SQLException e1) {
                System.out.println("SQLException in rollback" + e.getMessage());
            }
        }
    }
}

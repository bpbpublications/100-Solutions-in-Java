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
import java.sql.SQLException;

/**
 *
 * @author dhrutis
 */
public class JDBCExample {
    public static void main(String[] args) {

        Connection conn;
        //Since Windows authentication is used, integratedSecurity is set to true
        // the url has protocol:subprotocol:server-name:port number, database name
        // and authentication details.
        String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
        try {
            conn = DriverManager.getConnection(dbURL);
            String query = "SELECT * FROM Student where StudName like ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "M%");
            ResultSet rs = pstmt.executeQuery();
            System.out.println("ID \t Name \t Percentage");
            while(rs.next()){
                System.out.println(rs.getInt("StudId")+"\t"+rs.getString("StudName")+"\t"+rs.getFloat("Percentage"));
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

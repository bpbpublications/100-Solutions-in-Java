/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author dhrutis
 */
public class SPDemo {
    public static Connection conn = null;

    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
//            Statement st = conn.createStatement();
//            String myProcedure = "Create Procedure Show_Students as select * from Student order by StudName";
//            // Execute the stored procedure
//            int result = st.executeUpdate(myProcedure);
//            if(result==0)
//                System.out.println("Stored Procedure Created");
//            else
//                System.out.println("Stored Procedure Creation Failed");

            CallableStatement cst = conn.prepareCall("{call Show_Students}");
            ResultSet rs = cst.executeQuery();
            System.out.println("StudId\tStudName\tPercentage");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t\t" + rs.getFloat(3));
            }

        } catch (Exception e) {
            System.out.println("");
            e.printStackTrace();
        }
    }
}

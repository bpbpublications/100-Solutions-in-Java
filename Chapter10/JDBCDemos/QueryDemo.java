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
public class QueryDemo {
    public static void main(String[] args) {
        Connection conn;
        try{
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);

            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate("insert into Student values (6,'Roger','78.6')");
            if(result >0){
                System.out.println("Data Inserted");
            }else{
                System.out.println("Insert Failed");
            }
            
        }catch(Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}

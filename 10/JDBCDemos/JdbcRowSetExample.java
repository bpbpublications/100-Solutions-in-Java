/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBCDemos;

import com.sun.rowset.JdbcRowSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.rowset.JdbcRowSet;

/**
 *
 * @author dhrutis
 */
public class JdbcRowSetExample {
    public static Statement stmt;
    public static Connection conn;

    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("Select * from Student");
            JdbcRowSet jrs = new JdbcRowSetImpl(rs);
            
//            conn.close();
//            update row using JdbcRowSet
//            jrs.absolute(3);
//            jrs.updateFloat(3, 34.5f);  //update percentage of student in row 3
//            jrs.updateFloat("Percentage", 77.5f); //update percentage of student in row 3
//            jrs.updateRow();

//            insert row using JdbcRowSet
            jrs.moveToInsertRow();
            jrs.updateInt("StudId", 17);
            jrs.updateString("StudName", "Rosie");
            jrs.updateFloat("Percentage", 77.4f);
            jrs.insertRow();
            //delete row using JdbcRowSet
//            jrs.last();
//            jrs.deleteRow();
           

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

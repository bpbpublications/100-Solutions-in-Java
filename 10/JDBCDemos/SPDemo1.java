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
public class SPDemo1 {
    public static void main(String[] args) {
        try {
            Connection conn;

            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);

            /* --Create below parameterised procedure in your database---
            --The procedure uses max funtion to find the maximum percentage
            --and returns it to caller as OUT parameter
            Create procedure findMaxPer
            @per_max float OUT
            as
            select @per_max = max(Percentage) from Student
             */
            CallableStatement cst = conn.prepareCall("{call findMaxPer(?)}");
            cst.registerOutParameter(1, java.sql.Types.FLOAT);
            cst.execute();
            float maxPer = cst.getFloat(1);
            System.out.println("Maximum Percentage is " + maxPer);

            //second example with IN parameter
            /*
            --Create below parameterised procedure in your database---
            --The procedure takes student id as parameter and returns the student details of that student
            Create Procedure Display_StudInfo (@Stud_Id Integer) 
            as
            select StudName, Percentage 
            from Student
            where StudId=@Stud_Id
             */
//            CallableStatement cst1 = conn.prepareCall("{call Display_StudInfo(?)}");
//            cst1.setInt(1, 4);
//            ResultSet rs = cst1.executeQuery();
//            while (rs.next()) {
//                System.out.println("Name:" + rs.getString(1));
//                System.out.println("Percentage:" + rs.getFloat(2));
//            }

            //third example with IN and OUT parameters
            /*
            --Create below parameterised procedure in your database---
            --The procedure takes a baseline value as parameter and returns the smallest percentage greater than the baseline
            Create procedure [dbo].[findPer]
            @baseline int, @per_min int OUT
            as
            select @per_min = min(Percentage) from Student where Percentage > @baseline
             */
//            CallableStatement cst2 = conn.prepareCall("{call findPer(?,?)}");
//            cst2.setInt(1, 40);
//            cst2.registerOutParameter(2, java.sql.Types.INTEGER);
//            cst2.execute();
//            int minPer = cst2.getInt(2);
//            System.out.println("Smallest Percentage greater than 40 is " + minPer);
        } catch (Exception e) {
            System.out.println("");
            e.printStackTrace();
        }
    }
}

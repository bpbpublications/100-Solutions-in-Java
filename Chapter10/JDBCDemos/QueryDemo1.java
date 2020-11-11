package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author dhrutis
 */
public class QueryDemo1 {
    public static void main(String[] args) {
        Connection conn;
        try{
            String dbURL = "jdbc:sqlserver://DHRUTIS:1433; databaseName=MyDB;integratedSecurity=true;";
            conn = DriverManager.getConnection(dbURL);
            String query = "insert into Student values (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1,7);
            pstmt.setString(2, "Victor");
            pstmt.setFloat(3,76.8f);
            int result = pstmt.executeUpdate();
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

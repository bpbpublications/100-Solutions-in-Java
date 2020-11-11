/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sess5Codes;

/**
 *
 * @author Admin3
 */
public class DBTransaction implements ILog {

    @Override
    public void logMsg(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        System.out.println("Connecting to: "+ILog.MYSQL_DB_NAME);
        DBTransaction obj = new DBTransaction();
        obj.logMsg("Database Connected Successfully");
        obj.logFatalError("Fatal Error while closing DB");
        System.out.println("Null check: "+ILog.checkNull("Hello"));
    }
}

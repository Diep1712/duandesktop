/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnecttoSQLServer {
   
    public static void main(String[] args) {
        var server="Admin-PC";
    var user="sa";
    var password="123456";
    var db="doannhom11";
    var     port= 1433; 
    SQLServerDataSource dsDataSource=new SQLServerDataSource();
    dsDataSource.setUser(user);
    dsDataSource.setPassword(password);
    dsDataSource.setDatabaseName(db);
    dsDataSource.setServerName(server);
    dsDataSource.setPortNumber(port);
        try(Connection conn = dsDataSource.getConnection()) {
            System.out.println("ket noi thanh cong");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

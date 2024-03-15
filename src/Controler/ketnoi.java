/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public class ketnoi {

    public Connection getConnection() {
        String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=doannhom11;user=sa;password=123456;encrypt=false";
      Connection conn =null;
        try {
            conn = DriverManager.getConnection(connectionURL);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
   
 
  
    
    }
  

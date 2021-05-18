/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author USER
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
         try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/gms" , "root","rootpass");
    //Statement st=con.createStatement();
            return con;
         } 
        catch (Exception e) {
    return null;
        }
    
}
    public static void main(String args[]){
        Connection con=ConnectionProvider.getCon();
        
    }
    String connection(String c){
        return c;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmpsc221.projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author psupo
 */
public class TestDBConnection {

    public static void main(String[] args) {
        Connection conn = null;
        ResultSet results;
        java.sql.Statement stmt;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn
                    = DriverManager.getConnection("jdbc:mysql://localhost/test?"
                            + "user=root&password=rohan");

            // Do something with the Connection
            stmt = conn.createStatement();
            String query = "select * from testTable";
            
            results = stmt.executeQuery(query);
            while(results.next()) {
                System.out.println("Name:" + results.getString("Name"));
            }
            results.close();
                stmt.close();
                conn.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("Exception: " + ex.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}

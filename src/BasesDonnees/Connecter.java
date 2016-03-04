/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasesDonnees;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Julien
 */
public class Connecter {
    Connection conn=null;
    public static Connection ConnectDB(){
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sir","root","");
            JOptionPane.showMessageDialog(null,"Connexion à la base de données établie");
            return conn;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }

    
}

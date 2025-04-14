package Etudiant;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
    
    public static Connection getCon(){
        try {
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/infoetudiants","root","admin");
            return con;
        } 
        catch (Exception e) {
            return null;
        }
    }
}

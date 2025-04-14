package Etudiant;

import java.sql.*;

public class Login {

    public boolean authentifier(String nom, String motDePasse) {
        try (Connection conn = Connexion.getCon();
             Statement st = conn.createStatement()) {

            String sql = "SELECT * FROM login WHERE nom = '" + nom + "' AND password = '" + motDePasse + "'";
            ResultSet rs = st.executeQuery(sql);

            return rs.next();

        } catch (Exception e) {
            System.out.println("Erreur d'authentification : " + e.getMessage());
            return false;
        }
    }
}

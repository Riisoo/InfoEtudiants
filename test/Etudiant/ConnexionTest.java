package Etudiant;

import java.sql.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConnexionTest {
    
    @Test
    public void testConnexionSucces() {
        // On tente d'obtenir une connexion à la base de données
        Connection connection = Connexion.getCon();

        // Vérifie que la connexion n'est pas nulle
        assertNotNull(connection, "La connexion à la base de données devrait réussir.");
    }

    @Test
    public void testConnexionEchec() {
        // Pour simuler un échec, on essaie de se connecter avec de mauvaises informations
        Connection connection = null;
        try {
            // Tentative de connexion avec un mauvais mot de passe
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infoetudiants", "root", "mauvais_mot_de_passe");
        } catch (Exception e) {
            // Si une exception est lancée, la connexion sera nulle
        }

        // Vérifie que la connexion échoue et est nulle
        assertNull(connection, "La connexion à la base de données devrait échouer avec des informations incorrectes.");
    }
}

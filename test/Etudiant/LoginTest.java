package Etudiant;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testAuthentifierAvecIdentifiantsValides() {
        Login login = new Login();
        boolean resultat = login.authentifier("Sofia Motai", "123"); // Assure-toi que ce compte existe
        assertTrue("L'utilisateur avec identifiants valides devrait être authentifié", resultat);
    }

    @Test
    public void testAuthentifierAvecIdentifiantsInvalides() {
        Login login = new Login();
        boolean resultat = login.authentifier("Sofia Mot", "Admin");
        assertFalse("L'utilisateur avec identifiants invalides ne devrait pas être authentifié", resultat);
    }
}

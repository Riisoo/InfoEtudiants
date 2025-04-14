package Etudiant;

import org.junit.Test;

import static org.junit.Assert.*;

public class EtudiantTest {

    @Test
    public void testConstructeurParDéfautEtSettersEtGetters() {
        Etudiant e = new Etudiant();

        e.setID(6);
        e.setPrenom("Ali");
        e.setNom("Ben Amor");
        e.setEmail("ali@gmail.com");
        e.setNInscription("A1234567");
        e.setCours("Java de base");

        assertEquals(6, e.getID());
        assertEquals("Ali", e.getPrenom());
        assertEquals("Ben Amor", e.getNom());
        assertEquals("ali@gmail.com", e.getEmail());
        assertEquals("A1234567", e.getNInscription());
        assertEquals("Java de base", e.getCours());
    }

    @Test
    public void testConstructeurAvecTousLesChamps() {
        Etudiant e = new Etudiant(6, "Sara", "Mejri", "sara@gmail.com", "B7654321", "Client/Serveur");

        assertEquals(6, e.getID());
        assertEquals("Sara", e.getPrenom());
        assertEquals("Mejri", e.getNom());
        assertEquals("sara@gmail.com", e.getEmail());
        assertEquals("B7654321", e.getNInscription());
        assertEquals("Client/Serveur", e.getCours());
    }

    @Test
    public void testConstructeurSansID() {
        Etudiant e = new Etudiant("Nabil", "Trabelsi", "nabil@gmail.com", "C9876543", "Socket TCP");

        assertEquals("Nabil", e.getPrenom());
        assertEquals("Trabelsi", e.getNom());
        assertEquals("nabil@gmail.com", e.getEmail());
        assertEquals("C9876543", e.getNInscription());
        assertEquals("Socket TCP", e.getCours());

        // Par défaut, ID devrait être 0 si non initialisé
        assertEquals(0, e.getID());
    }
}

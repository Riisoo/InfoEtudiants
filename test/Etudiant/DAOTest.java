package Etudiant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class DAOTest {

    private DAO dao;
    private Etudiant testEtudiant;

    @Before
    public void setUp() {
        dao = new DAO();

        // Création d'un étudiant de test
        testEtudiant = new Etudiant();
        testEtudiant.setPrenom("Rania");
        testEtudiant.setNom("Karam");
        testEtudiant.setEmail("rania@gmail.com");
        testEtudiant.setNInscription("A1747853");
        testEtudiant.setCours("Français");

        // Ajout dans la base
        dao.addEtudiant(testEtudiant);
    }

    @After
    public void tearDown() {
        // Suppression des étudiants "Rania Karam" après chaque test
        ArrayList<Etudiant> etudiants = dao.getAllEtudiants();
        for (Etudiant e : etudiants) {
            if ("Rania".equals(e.getPrenom()) && "Karam".equals(e.getNom())) {
                dao.deleteEtudiant(e.getID());
            }
        }
    }

    @Test
    public void testAddEtudiant() {
        ArrayList<Etudiant> etudiants = dao.getAllEtudiants();
        boolean found = false;
        for (Etudiant e : etudiants) {
            if ("Rania".equals(e.getPrenom()) && "Karam".equals(e.getNom()) &&
                "rania@gmail.com".equals(e.getEmail()) &&
                "A1747853".equals(e.getNInscription()) &&
                "Français".equals(e.getCours())) {
                found = true;
                break;
            }
        }
        assertTrue("L'étudiant Rania Karam doit être trouvé dans la base", found);
    }

    @Test
    public void testUpdateEtudiant() {
        ArrayList<Etudiant> etudiants = dao.getAllEtudiants();
        Etudiant etudiantToUpdate = null;

        for (Etudiant e : etudiants) {
            if ("Rania".equals(e.getPrenom()) && "Karam".equals(e.getNom())) {
                etudiantToUpdate = e;
                break;
            }
        }

        assertNotNull("L'étudiant à modifier doit exister", etudiantToUpdate);

        etudiantToUpdate.setNom("Kamal");
        etudiantToUpdate.setCours("Mathématiques");
        dao.updateEtudiant(etudiantToUpdate);

        ArrayList<Etudiant> updatedList = dao.getAllEtudiants();
        boolean updated = false;
        for (Etudiant e : updatedList) {
            if ("Rania".equals(e.getPrenom()) && "Kamal".equals(e.getNom()) &&
                "Mathématiques".equals(e.getCours())) {
                updated = true;
                break;
            }
        }

        assertTrue("L'étudiant doit avoir été mis à jour avec succès", updated);
    }

    @Test
    public void testDeleteEtudiant() {
        ArrayList<Etudiant> etudiants = dao.getAllEtudiants();
        int idToDelete = -1;

        for (Etudiant e : etudiants) {
            if ("Rania".equals(e.getPrenom()) && "Kamal".equals(e.getNom())) {
                idToDelete = e.getID();
                break;
            }
        }

        assertNotEquals("Un ID valide doit être trouvé", -1, idToDelete);

        dao.deleteEtudiant(idToDelete);

        ArrayList<Etudiant> newList = dao.getAllEtudiants();
        boolean stillExists = false;
        for (Etudiant e : newList) {
            if (e.getID() == idToDelete) {
                stillExists = true;
                break;
            }
        }

        assertFalse("L'étudiant doit avoir été supprimé de la base", stillExists);
    }

    @Test
    public void testGetAllEtudiants() {
        ArrayList<Etudiant> etudiants = dao.getAllEtudiants();
        assertNotNull("La liste retournée ne doit pas être null", etudiants);
        assertTrue("Il doit y avoir au moins un étudiant dans la base", etudiants.size() > 0);
    }
}

package Etudiant;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {
    
    private Connection conn;

    public DAO() {
        this.conn = Connexion.getCon();
    }

    // Méthode pour afficher les informations des étudiants
    public ArrayList<Etudiant> getAllEtudiants() {
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        try {
            String query = "SELECT * FROM info";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Etudiant etd = new Etudiant();
                etd.setID(rs.getInt(1));
                etd.setPrenom(rs.getString(2));
                etd.setNom(rs.getString(3));
                etd.setEmail(rs.getString(4));
                etd.setNInscription(rs.getString(5));
                etd.setCours(rs.getString(6));
                etudiants.add(etd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return etudiants;
    }

    // Méthode pour ajouter un étudiant
    public void addEtudiant(Etudiant etd) {
        try {
            String query = "INSERT INTO info(prenom, nom, email, NInscription, cours) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, etd.getPrenom());
            pst.setString(2, etd.getNom());
            pst.setString(3, etd.getEmail());
            pst.setString(4, etd.getNInscription());
            pst.setString(5, etd.getCours());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Méthode pour modifier un étudiant
    public void updateEtudiant(Etudiant etd) {
        try {
            String query = "UPDATE info SET prenom=?, nom=?, email=?, NInscription=?, cours=? WHERE ID=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, etd.getPrenom());
            pst.setString(2, etd.getNom());
            pst.setString(3, etd.getEmail());
            pst.setString(4, etd.getNInscription());
            pst.setString(5, etd.getCours());
            pst.setInt(6, etd.getID());
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Méthode pour supprimer un étudiant
    public void deleteEtudiant(int id) {
        try {
            String query = "DELETE FROM info WHERE ID=?";
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

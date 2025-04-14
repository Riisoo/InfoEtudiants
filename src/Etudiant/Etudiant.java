package Etudiant;

public class Etudiant {
    int ID;
    String prenom;
    String nom;
    String email;
    String NInscription;
    String cours;

    public Etudiant() {
    }

    public Etudiant(int ID, String prenom, String nom, String email, String NInscription, String cours) {
        this.ID = ID;
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.NInscription = NInscription;
        this.cours = cours;
    }
    
    public Etudiant(String prenom, String nom, String email, String NInscription, String cours) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.NInscription = NInscription;
        this.cours = cours;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNInscription() {
        return NInscription;
    }

    public void setNInscription(String NInscription) {
        this.NInscription = NInscription;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }
    
}

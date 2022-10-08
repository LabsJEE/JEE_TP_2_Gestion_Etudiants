package web;

public class Etudiant {  
    public String nom;
    public String prenom;
    public int cin;
    public String sexe;
    public String specialite;
    
    public Etudiant(String nom, String prenom, int cin, String sexe, String specialite){
	this.nom = nom;
	this.prenom = prenom;
	this.cin = cin;
	this.sexe = sexe;
        this.specialite = specialite;
    }
    
    public String getNom() {
	return nom;
    }
    
    public String getPrenom() {
	return prenom;
    }
    
    public int getCin() {
	return cin;
    }
    
    public String getSexe() {
	return sexe;
    }
    
    public String getSpecialite() {
	return specialite;
    }
}
package web;

import java.util.ArrayList;

public class GestionEtudiants {
    private static ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
    
    public static void addEtudiant(String nom, String prenom, int cin, String sexe, String specialite) {
	etudiants.add(new Etudiant(nom, prenom, cin, sexe, specialite));
    }
    
    public static ArrayList<Etudiant> getEtudiants(){
	return etudiants;
    }
	
    public static void deleteEtudiant(int cin) {
	for(int i = 0; i < etudiants.size(); i++) {
            if(etudiants.get(i).getCin() == cin) {
		etudiants.remove(i);
		break;
            }
	}
    }
}
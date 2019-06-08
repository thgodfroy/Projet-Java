package modele;
//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/26830-
//liez-vos-tables-avec-des-objets-java-le-pattern-dao
public class eleve extends personne{

	//ID
	private int id = 0;
	//Nom de l'élève
	private String nom = "";
	//Prénom de l'élève
	private String prenom = "";

	//constructeur
	public eleve(int id, String nom, String prenom) {
	    this.id = id;
	    this.nom = nom;
	    this.prenom = prenom;
	  }
	//2nd constructeur
	public eleve(){

	}
	//Getters + Setters   
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getNom() {
	    return nom;
	}

	public void setNom(String nom) {
	    this.nom = nom;
	}

	public String getPrenom() {
	    return prenom;
	}

	public void setPrenom(String prenom) {
	    this.prenom = prenom;
	}

}

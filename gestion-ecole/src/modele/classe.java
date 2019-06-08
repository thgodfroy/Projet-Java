package modele;

import java.util.HashSet;
import java.util.Set;

//https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/26830-liez-vos-tables-avec-des-objets-java-le-pattern-dao
public class classe {
	//ID
	private int id = 0;
	//Nom du professeur
	private String nom = "";
	//Liste des professeurs
	private Set<professeur> listProfesseur = new HashSet<professeur>();
	//Liste des élèves
	private Set<eleve> listEleve = new HashSet<eleve>();
	//Premier constructeur
	public classe(int id, String nom) {
	    this.id = id;
	    this.nom = nom;
	  }
	//Second
	public classe(){}
	//Setters + Getters
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

	  public Set<professeur> getListProfesseur() {
	    return listProfesseur;
	  }

	  public void setListProfesseur(Set<professeur> listProfesseur) {
	    this.listProfesseur = listProfesseur;
	  }
		//ajout + suppression
	  public void addProfesseur(professeur prof) {
	    if(!listProfesseur.contains(prof))
	      listProfesseur.add(prof);
	  }

	  public void removeProfesseur(professeur prof ) {
	    this.listProfesseur.remove(prof);
	  }

	  public Set<eleve> getListEleve() {
	    return listEleve;
	  }

	  public void setListEleve(Set<eleve> listEleve) {
	    this.listEleve = listEleve;
	  }

	  //Ajoute un élève à la classe
	  public void addEleve(eleve eleve){
	    if(!this.listEleve.contains(eleve))
	      this.listEleve.add(eleve);
	  }

	  //Retire un élève de la classe
	  public void removeEleve(eleve eleve){
	    this.listEleve.remove(eleve);
	  }

	  public boolean equals(classe cls){
	    return this.getId() == cls.getId();
	  }
}

package modele;
import java.util.HashSet;
import java.util.Set;

public class professeur extends personne {
	
  //ID
  private int id_prof = 0; 
  //Liste des matières dispensées
  private Set<discipline> listMatiere = new HashSet<discipline>();

  public professeur(int id,String nom, String prenom, int id_prof) {  
	super(nom,prenom);
	this.id_prof=id_prof;
  }

  //public professeur(){
	  //?????
	  //super(id, nom, nom, nom);
  //}

  public int getId_prof() {
    return id_prof;
  }

  public void setId_prof(int id_prof) {
    this.id_prof = id_prof;
  }

  public Set<discipline> getListMatiere() {
    return listMatiere;
  }

  public void setListMatiere(Set<discipline> listMatiere) {
    this.listMatiere = listMatiere;
  }

  //Ajoute une matière à un professeur
  public void addMatiere(discipline matiere){
    this.listMatiere.add(matiere);
  }

  //Retire une matière à un professeur
  public void removeMatiere(discipline matiere){
    this.listMatiere.remove(matiere);
  }
}
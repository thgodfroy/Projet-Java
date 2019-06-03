package modele;
import java.util.HashSet;
import java.util.Set;

public class professeur {
  //ID
  private int id = 0;
  //Nom du professeur
  private String nom = "";
  //Prénom du professeur
  private String prenom = "";
  //Liste des matières dispensées
  private Set<discipline> listMatiere = new HashSet<discipline>();

  public professeur(int id, String nom, String prenom) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
  }

  public professeur(){}

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
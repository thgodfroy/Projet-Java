package modele;

public class ecole {

	
	  private int id = 0;
	  //Nom du professeur
	  private String nom = "";

	  public ecole(int id, String nom) {
	    this.id = id;
	    this.nom = nom;
	  }

	  public ecole(){}

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
}

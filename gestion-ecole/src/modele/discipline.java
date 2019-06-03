package modele;

public class discipline {
	
	//ID
	  private int id = 0;
	  //Nom du professeur
	  private String nom = "";

	  public discipline(int id, String nom) {
	    this.id = id;
	    this.nom = nom;
	  }

	  public discipline(){}

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

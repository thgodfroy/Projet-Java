package modele;

public class personne {

	private int id;
	private String nom, prenom, type;
	//Constructeur
    public personne(int id,String nom, String prenom, String type) {

    	this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.type=type; //Il y a 3 types de personnes : eleves, prof et admin
    }
    //2nd constructeur
    public personne(String nom, String prenom) {

    }
    //Setters et getters
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }

}

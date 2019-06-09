package implement;

import java.sql.SQLException;
import java.util.ArrayList;

import controleur.Connexion;
import modele.discipline;
import modele.personne;

public class personneDAO extends DAO<personne> {

	public personneDAO(Connexion conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(personne obj) {
		
		Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom() +",'" + obj.getPrenom() +",'" + obj.getType()  +",'" + obj.getMdp()+"'";
		  
		  String requete = "INSERT INTO personne VALUES ("+values+")";
		  
		  
		  try {
			  c.executeUpdate(requete);
			  System.out.println("Requete ajoutee : " +requete);
			  return true;
			  
		  }catch (SQLException e) {
			 
		  }
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(personne obj) {
		
		Connexion c = this.getConnexion();

		  int id = obj.getId();
		  
		  String requete = "DELETE FROM personne where id ="+id;
		  
		  try {
			  c.executeUpdate(requete);
			  System.out.println("Requete supprimee : " +requete);
			  return true;
			  
		  }catch (SQLException e) {
			
		  }
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(personne obj) {
		
		Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "UPDATE personne SET "+values+" WHERE id ="+obj.getId()+"";
		  
		  
		  try {
			  c.executeUpdate(requete);
			  System.out.println("Requete mise a jour : " +requete);
			  return true;
			  
		  }catch (SQLException e) {
			 
		  }
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public personne find(int id) {
		
		  personne matiere = new personne();
		  ArrayList<String> tab = new ArrayList<String>();

		  try {
			  
			  Connexion c = this.getConnexion();
			  c.remplirChampsRequete("SELECT from personne WHERE id ="+id);
			  //Pas complet
			  
		  }catch (SQLException e) {
			 e.printStackTrace();
		  }
		
		// TODO Auto-generated method stub
		return matiere;
	}

}

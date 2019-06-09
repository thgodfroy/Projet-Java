package implement;

import controleur.Connexion;
import modele.discipline;
import modele.ecole;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ecoleDAO extends DAO<ecole> {

	public ecoleDAO(Connexion conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(ecole obj) {
		
		 Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "INSERT INTO ecole VALUES =("+values+")";
		  
		  
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
	public boolean delete(ecole obj) {
		
		Connexion c = this.getConnexion();

		  int id = obj.getId();
		  
		  String requete = "DELETE FROM ecole where id="+id;
		  
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
	public boolean update(ecole obj) {
		
		 Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "UPDATE ecole SET "+values+" WHERE id "+obj.getId()+"";
		  
		  
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
	public ecole find(int id) {
		
		ecole matiere = new ecole();
		  ArrayList<String> tab = new ArrayList<String>();

		  try {
			  
			  Connexion c = this.getConnexion();
			  c.remplirChampsRequete("SELECT from ecole WHERE id ="+id);
			  //Pas complet
			  
		  }catch (SQLException e) {
			 e.printStackTrace();
		  }
		
		// TODO Auto-generated method stub
		return matiere;
	}

}

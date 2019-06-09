package implement;

import modele.discipline;
import modele.trimestre;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controleur.Connexion;

public class trimestreDAO extends DAO<trimestre> {

	public trimestreDAO(Connexion conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(trimestre obj) {
		
		Connexion c = this.getConnexion();

		
		  String values = obj.getId() +",'" + obj.getNumero() +"'";
		  
		  String requete = "INSERT INTO trimestre VALUES ("+values+")";
		  
		  
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
	public boolean delete(trimestre obj) {
		
		 Connexion c = this.getConnexion();

		  int id = obj.getId();
		  
		  String requete = "DELETE FROM discipline where id ="+id;
		  
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
	public boolean update(trimestre obj) {
		
		Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNumero()+"'";
		  
		  String requete = "UPDATE discipline SET "+values+" WHERE id ="+obj.getId()+"";
		  
		  
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
	public trimestre find(int id) {
		
		trimestre matiere = new trimestre();
		  ArrayList<String> tab = new ArrayList<String>();

		  try {
			  
			  Connexion c = this.getConnexion();
			  c.remplirChampsRequete("SELECT from discipline WHERE id ="+id);
			  //Pas complet
			  
		  }catch (SQLException e) {
			 e.printStackTrace();
		  }
		
		// TODO Auto-generated method stub
		return matiere;
	}

}

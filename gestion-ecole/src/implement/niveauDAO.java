package implement;

import java.sql.SQLException;
import java.util.ArrayList;

import controleur.Connexion;
import modele.ecole;
import modele.niveau;

public class niveauDAO extends DAO<niveau> {

	public niveauDAO(Connexion conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(niveau obj) {
		
		 Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "INSERT INTO niveau VALUES ("+values+")";
		  
		  
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
	public boolean delete(niveau obj) {
		
		 Connexion c = this.getConnexion();

		  int id = obj.getId();
		  
		  String requete = "DELETE FROM niveau where id"+id;
		  
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
	public boolean update(niveau obj) {
		
		 Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "UPDATE niveau SET "+values+" WHERE id "+obj.getNom()+"";
		  
		  
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
	public niveau find(int id) {
		niveau matiere = new niveau();
		  ArrayList<String> tab = new ArrayList<String>();

		  try {
			  
			  Connexion c = this.getConnexion();
			  c.remplirChampsRequete("SELECT from ecole WHERE id "+id);
			  //Pas complet
			  
		  }catch (SQLException e) {
			 e.printStackTrace();
		  }
		
		// TODO Auto-generated method stub
		return matiere;
	}

}

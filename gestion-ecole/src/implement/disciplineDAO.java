package implement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;

import controleur.Connexion;
import modele.discipline;

public class disciplineDAO extends DAO<discipline> {
	
	  public disciplineDAO(Connexion conn) {
		    super(conn);
		  }

		  public boolean create(discipline obj) {
		    
			  Connexion c = this.getConnexion();

			  String values = obj.getId() +",'" + obj.getNom()+"'";
			  
			  String requete = "INSERT INTO discipline VALUES ("+values+")";
			  
			  
			  try {
				  c.executeUpdate(requete);
				  System.out.println("Requete ajoutee : " +requete);
				  return true;
				  
			  }catch (SQLException e) {
				 // A CHANGER Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
			  }
			  
			  return false;
		  }

		  public boolean delete(discipline obj) {
		    
			  Connexion c = this.getConnexion();

			  int id = obj.getId();
			  
			  String requete = "DELETE FROM discipline where id"+id;
			  
			  try {
				  c.executeUpdate(requete);
				  System.out.println("Requete supprimee : " +requete);
				  return true;
				  
			  }catch (SQLException e) {
				
			  }
			  
			  return false;
		  }

		  public boolean update(discipline obj) {
		    
			  Connexion c = this.getConnexion();

			  String values = obj.getId() +",'" + obj.getNom()+"'";
			  
			  String requete = "UPDATE discipline SET "+values+" WHERE id "+obj.getId()+"";
			  
			  
			  try {
				  c.executeUpdate(requete);
				  System.out.println("Requete mise a jour : " +requete);
				  return true;
				  
			  }catch (SQLException e) {
				 
			  }
			  
			  return false;
		  }

		  public discipline find(int id) {
		    
			  discipline matiere = new discipline();
			  ArrayList<String> tab = new ArrayList<String>();

			  try {
				  
				  Connexion c = this.getConnexion();
				  c.remplirChampsRequete("SELECT from discipline WHERE id "+id);
				  //Pas complet
				  
			  }catch (SQLException e) {
				 e.printStackTrace();
			  }
			  
		    //try {
		      //ResultSet result = this.connect.createStatement(
		        //ResultSet.TYPE_SCROLL_INSENSITIVE, 
		        //ResultSet.CONCUR_READ_ONLY
		      //).executeQuery("SELECT * FROM matiere WHERE mat_id = " + id);
		        //if(result.first())
		          //matiere = new discipline(id, result.getString("mat_nom"));         
		    //} catch (SQLException e) {
		      //e.printStackTrace();
		    //}
		    return matiere;
		  }
		}
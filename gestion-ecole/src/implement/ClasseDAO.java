package implement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controleur.Connexion;
import modele.classe;
import modele.discipline;

public class ClasseDAO extends DAO<classe> {
	  public ClasseDAO(Connexion conn) {
	    super(conn);
	  }

	  public boolean create(classe obj) {
	    
		  Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "INSERT INTO classe VALUES ("+values+")";
		  
		  
		  try {
			  c.executeUpdate(requete);
			  System.out.println("Requete ajoutee : " +requete);
			  return true;
			  
		  }catch (SQLException e) {
			 
		  }
		  return false;
	  }

	  public boolean delete(classe obj) {
	    
		  Connexion c = this.getConnexion();

		  int id = obj.getId();
		  
		  String requete = "DELETE FROM classe where id ="+id;
		  
		  try {
			  c.executeUpdate(requete);
			  System.out.println("Requete supprimee : " +requete);
			  return true;
			  
		  }catch (SQLException e) {
			
		  }
		  
		  return false;
	  }
	   
	  public boolean update(classe obj) {
	    
		  Connexion c = this.getConnexion();

		  String values = obj.getId() +",'" + obj.getNom()+"'";
		  
		  String requete = "UPDATE classe SET "+values+" WHERE id ="+obj.getId()+"";
		  
		  
		  try {
			  c.executeUpdate(requete);
			  System.out.println("Requete mise a jour : " +requete);
			  return true;
			  
		  }catch (SQLException e) {
			 
		  }
		  
		  return false;
	  }

	  public classe find(int id) {
		  
		  
		  classe cla = new classe();
		  ArrayList<String> tab = new ArrayList<String>();

		  try {
			  
			  Connexion c = this.getConnexion();
			  c.remplirChampsRequete("SELECT from classe WHERE id ="+id);
			
			  
		  }catch (SQLException e) {
			 e.printStackTrace();
		  } 
		  
		  return cla;
	    /*try {
	      ResultSet result = this.connect.createStatement(
	        ResultSet.TYPE_SCROLL_INSENSITIVE, 
	        ResultSet.CONCUR_READ_ONLY
	      ).executeQuery("SELECT * FROM classe WHERE cls_id = " + id); 

	      if(result.first()){
	        classe = new classe(id, result.getString("cls_nom"));

	        result = this.connect.createStatement().executeQuery(
	          "SELECT prof_id, prof_nom, prof_prenom from professeur " +
	          "INNER JOIN j_mat_prof ON prof_id = jmp_prof_k " +
	          "INNER JOIN j_cls_jmp ON jmp_id = jcm_jmp_k AND jcm_cls_k = " + id
	        );

	        ProfesseurDAO profDao = new ProfesseurDAO(this.connect);

	        while(result.next())             
	          classe.addProfesseur(profDao.find(result.getInt("prof_id")));

	        EleveDAO eleveDao = new EleveDAO(this.connect);
	        result = this.connect.createStatement().executeQuery(
	          "SELECT elv_id, elv_nom, elv_prenom FROM eleve " +
	          "INNER JOIN classe ON elv_cls_k = cls_id AND cls_id = " + id
	        );

	        while(result.next())
	          classe.addEleve(eleveDao.find(result.getInt("elv_id")));
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } */
	
	  }

	}
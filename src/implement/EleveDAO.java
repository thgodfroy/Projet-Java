package implement;

import java.sql.ResultSet;
import java.sql.SQLException;

import controleur.Connexion;
import modele.eleve;

public class EleveDAO extends DAO<eleve> {
	
	  public EleveDAO(Connexion conn) {
	    super(conn);
	  }

	  public boolean create(eleve obj) {
	    return false;
	  }

	  public boolean delete(eleve obj) {
	    return false;
	  }
	   
	  public boolean update(eleve obj) {
	    return false;
	  }
	   
	  public eleve find(int id) {
	    eleve eleve = new eleve();      
	      
	    /*try {
	      ResultSet result = this.connect.createStatement(
	        ResultSet.TYPE_SCROLL_INSENSITIVE,
	        ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM eleve WHERE elv_id = " + id);
	      if(result.first())
	        eleve = new eleve(
	          id,
	          result.getString("elv_nom"),
	          result.getString("elv_prenom"
	        ));         
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } */
	    return eleve;
	  }


	}
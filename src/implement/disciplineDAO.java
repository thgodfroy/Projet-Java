package implement;

import java.sql.ResultSet;
import java.sql.SQLException;

import controleur.Connexion;
import modele.discipline;

public class disciplineDAO extends DAO<discipline> {
	
	  public disciplineDAO(Connexion conn) {
		    super(conn);
		  }

		  public boolean create(discipline obj) {
		    return false;
		  }

		  public boolean delete(discipline obj) {
		    return false;
		  }

		  public boolean update(discipline obj) {
		    return false;
		  }

		  public discipline find(int id) {
		    discipline matiere = new discipline();  

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
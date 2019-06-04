package implement;

import java.sql.ResultSet;
import java.sql.SQLException;

import controleur.Connexion;
import modele.professeur;

public class ProfesseurDAO extends DAO<professeur> {
	  public ProfesseurDAO(Connexion conn) {
	    super(conn);
	  }

	  public boolean create(professeur obj) {
	    return false;
	  }

	  public boolean delete(professeur obj) {
	    return false;
	  }

	  public boolean update(professeur obj) {
	    return false;
	  }
	   
	  public professeur find(int id) {
	    professeur professeur = new professeur();            
	    /*try {
	      ResultSet result = this.connect.createStatement(
	        ResultSet.TYPE_SCROLL_INSENSITIVE, 
	        ResultSet.CONCUR_READ_ONLY
	      ).executeQuery(
	        "SELECT * FROM professeur "+
	        "LEFT JOIN j_mat_prof ON jmp_prof_k = prof_id " + 
	        "AND prof_id = "+ id +
	        " INNER JOIN matiere ON jmp_mat_k = mat_id"
	      );
	      if(result.first()){
	        professeur = new professeur(id, result.getString("prof_nom"), result.getString("prof_prenom"));
	        result.beforeFirst();
	        disciplineDAO matDao = new disciplineDAO(this.connect);
	            
	        while(result.next())
	          professeur.addMatiere(matDao.find(result.getInt("mat_id")));
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    } */
	    //test
	    
	  }

	  public boolean update1(professeur obj) {
	    return false;
	  }
	}
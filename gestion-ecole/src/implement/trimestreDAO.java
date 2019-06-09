package implement;

import modele.trimestre;

import java.sql.ResultSet;
import java.sql.SQLException;

import controleur.Connexion;

public class trimestreDAO extends DAO<trimestre> {

	public trimestreDAO(Connexion conn) {
		super(conn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(trimestre obj) {
		
		Connexion c = this.getConnexion();

		
		  String values = obj.getId() +",'" + obj.getNumero() +",'" obj.getDebut() +",'" obj.getFin() +",'" obj.getId_as()+"'";
		  
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(trimestre obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public trimestre find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

package controleur;

import java.sql.DriverManager;
import java.sql.SQLException;

import vue.fenetre;

public class main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		fenetre fen = new fenetre();

		String name = "projetjava";
		String login="root";
		String password="";
	
		
		Connexion c = new Connexion (name, login, password);
		
		//try {
			
			
		//}catch(SQLException e) {
			//e.printStackTrace();
		//}
		
		
		String requete = "INSERT INTO discipline(nom) VALUES ('yes')";
	//	String requete2 = "INSERT INTO discipline(id) VALUES ('1')";
		c.executeUpdate(requete);

	}

}

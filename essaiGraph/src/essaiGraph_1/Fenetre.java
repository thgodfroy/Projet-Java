package essaiGraph_1;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color; 
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
	private JPanel pan = new JPanel();

	  public Fenetre(){
	    this.setTitle("Ma fenêtre");
	    this.setSize(300, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    //Ajout du bouton à notre content pane
	    this.setContentPane(pan);
	    this.setVisible(true);
	    //Au centre
	    this.getContentPane().add(new JButton("Recherche d'informations"), BorderLayout.CENTER);
	    //Au nord
	    this.getContentPane().add(new JButton("Mis à jour de données"), BorderLayout.NORTH);
	    //Au sud
	    this.getContentPane().add(new JButton("Reporting"), BorderLayout.SOUTH);
	    this.setVisible(true);
	    //Bonjour
	    //yes
	  }           
}
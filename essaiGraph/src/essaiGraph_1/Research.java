package essaiGraph_1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


import java.awt.BorderLayout;
import java.awt.Color; 
import javax.swing.JPanel;

public class Research extends JFrame {
	private JPanel pan = new JPanel();
	
	public Research(){
		 this.setTitle("Recherche");
		 this.setSize(300, 150);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);
		 //Ajout du bouton à notre content pane
		 this.setContentPane(pan);
		 this.setVisible(true);
		 //Au centre
		 this.getContentPane().add(new JTextField()) ;
		 //Au nord
		 this.getContentPane().add(new JButton("Mis à jour de donn�es"), BorderLayout.NORTH);
		 //Au sud
		 this.getContentPane().add(new JButton("Reporting"), BorderLayout.SOUTH);
		 this.setVisible(true);
	}
}

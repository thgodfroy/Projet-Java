package vue;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class fenetre extends JFrame implements MouseListener {
	private JPanel pan = new JPanel();

	  public fenetre(){
	    this.setTitle("Ma fenêtre");
	    this.setSize(300, 150);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    //Ajout du bouton à notre content pane
	    this.setContentPane(pan);
	    this.setVisible(true);
	    //Au centre
	    this.getContentPane().add(new JButton("Recherche d'informations"), BorderLayout.CENTER);
	    //Ajouter un listener pour rediriger vers une public void nextpage()
	    //Au nord
	    this.getContentPane().add(new JButton("Mise à jour de données"), BorderLayout.NORTH);
	    //listener pour rediriger vers une page méthode public void nextpage update()
	    //Au sud	    
	    this.getContentPane().add(new JButton("Reporting"), BorderLayout.SOUTH);
	  //listener pour rediriger vers une page méthode public void nextpage update()
	    this.setVisible(true);
	  }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}           
}
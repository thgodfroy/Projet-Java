package vue;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Menu1;



public class Connexion extends JPanel implements ActionListener
{
	//LEGENDE
	private JLabel TitreConnexion = new JLabel("Gestion école:");
	
	//LES BOUTONS
	public JButton Connexion = new JButton("Connexion");
	private JButton Annuler = new JButton("Annuler");
	
	//ZONE DE TEXTE
	private JTextField Identifiant = new JTextField();
	private JTextField Password = new JTextField();

	
	public Connexion()
	{
		this.setLayout(new GridLayout(2,1));
		this.setBounds(100, 140, 500, 190);
		
		GridLayout gl = new GridLayout(2,2);
		gl.setHgap(10);
		gl.setVgap(10);
		
		JPanel formulaireConnexion = new JPanel(gl);
		
		
		this.add(TitreConnexion);
		TitreConnexion.setHorizontalAlignment(JLabel.CENTER);
		
		formulaireConnexion.add(Identifiant);
		formulaireConnexion.add(Password);
		
		formulaireConnexion.add(Connexion);
		formulaireConnexion.add(Annuler);
		
		this.add(formulaireConnexion);
		
		Connexion.addActionListener(this);
		Annuler.addActionListener(this);
		
		
		this.setVisible(true);	
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==Connexion)
		{
			System.out.println("shit");
			//Accueil unAccueil = new Accueil();
			Menu1.getMonPanel().setVisible(false);
			Menu1.getMonPanel().removeAll();
			Menu1.setMonPanel( new Accueil());
			Menu1.getMonPanel().setVisible(true);
			this.setVisible(true);
			
		}
		
	}
}
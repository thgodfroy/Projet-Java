package modele;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controleur.Menu1;



public class accueil extends JPanel implements ActionListener
{
	
	private JLabel logoEleve = new JLabel();
	private JLabel logoProfesseur = new JLabel();

	private JButton Eleve;
	private JButton Professeur;
	
	private JLabel eleve;
	private JLabel professeur;
	
	public accueil()
	{
		this.setLayout(new GridLayout(1,2));
		this.setBounds(100, 150, 500, 360);
		
		
		
		JPanel PanelAccueil = new JPanel(); //CREATION PANEL POUR LA POSITION DES BOUTONS   
	
		PanelAccueil.setSize(500,500);
		
		PanelAccueil.add(Eleve);
		PanelAccueil.add(Professeur);
		
		this.add(PanelAccueil);
		
		Eleve.addActionListener(this);
		Professeur.addActionListener(this);
		
		this.setVisible(true);		
	}

	public void actionPerformed(ActionEvent e) 
	{
		Menu1.getMonPanel().setVisible(false);
		Menu1.getMonPanel().removeAll();	
		
		if (e.getSource()==Eleve)
		{
			//Menu1.setMonPanel( new GestionEleve());
			Menu1.getMonPanel().setVisible(true);
			this.removeAll();
			this.add(Menu1.getMonPanel());
			this.setVisible(true);
			
		}
		else if (e.getSource()==Professeur)
		{
			//MenuGeneral.getMonPanel().setVisible(false);
			//MenuGeneral.getMonPanel().removeAll();
			//Menu1.setMonPanel( new GestionProfesseur());
			Menu1.getMonPanel().setVisible(true);
			this.removeAll();
			this.add(Menu1.getMonPanel());
			this.setVisible(true);
		}
	}
}

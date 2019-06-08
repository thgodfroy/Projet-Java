package controleur;


import modele.accueil;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class Menu1 extends JFrame implements ActionListener
{
	private static JPanel monPanel = new JPanel();
	private  JPanel enTete = new JPanel();
	private JMenuBar maBarre = new JMenuBar();
	private JMenu fichier = new JMenu("Fichier");
	private JMenuItem Connexion = new JMenuItem("Connexion");
	private JMenuItem Accueil = new JMenuItem("Accueil");
	private JMenu Utilisateur = new JMenu("Utilisateur");
	private JMenuItem Eleve = new JMenuItem("Eleve");
	private JMenuItem Professeur = new JMenuItem("Professeur");
	private JMenu Edition = new JMenu("Edition");
	private JMenuItem AjouterEleve = new JMenuItem("Ajouter un Eleve");
	private JMenuItem AjouterProfesseur = new JMenuItem("Ajouter un Professeur");
	
	private BDD maBDD;
	private Boolean connected;
	
	private JLabel titre; //LOGO DE L'APPLICATION 
	
	public static JPanel getMonPanel() { return monPanel; }
	public static void setMonPanel(JPanel monPanel) { Menu1.monPanel = monPanel; }
	
	public Menu1()
	{
		this.maBDD = new BDD("localhost", "projetJava", "root", "root");
		this.maBDD.seConnecter();
		this.setSize(700, 500);
		this.setLayout(null);

		//monPanel.setBounds(0, 140, 700, 360);
		
		this.connected = false;
		
		//VERIFICATION D'UN COMPTE DEJA CO
		if (connected == false) 
		{
			monPanel.setVisible(false);
			monPanel = new Connexion();
			monPanel.setVisible(true);
			this.add(monPanel);
			this.setVisible(true);
		}
		else
		{
			monPanel.setVisible(false);
			monPanel = new accueil();
			monPanel.setVisible(true);
			this.add(monPanel);
			this.setVisible(true);
		}
		
		
		
		//monPanel.setVisible(true);
		
		//this.add(monPanel);
		fichier.add(Connexion);
		fichier.add(Accueil);
		Utilisateur.add(Eleve);
		Utilisateur.add(Professeur);
		Edition.add(AjouterEleve);
		Edition.add(AjouterProfesseur);
		maBarre.add(fichier);
		maBarre.add(Utilisateur);
		maBarre.add(Edition);
		this.setJMenuBar(maBarre);
		Connexion.addActionListener(this);
		Accueil.addActionListener(this);
		Eleve.addActionListener(this);
		Professeur.addActionListener(this);
		AjouterEleve.addActionListener(this);
		AjouterProfesseur.addActionListener(this);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.maBDD.seDeconnecter();
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		monPanel.removeAll();
		monPanel.setVisible(false);
		this.getContentPane().removeAll();
		if (e.getSource()==Connexion)
		{
			monPanel = new Connexion();
			monPanel.setVisible(true);
			this.getContentPane().add(monPanel);
			this.setVisible(true);
		}
		else if (e.getSource()==Accueil)
		{
			monPanel.removeAll();
			monPanel.setVisible(false);
			this.getContentPane().removeAll();
			monPanel = new accueil();
			monPanel.setVisible(true);
			this.getContentPane().add(monPanel);
			this.setVisible(true);
		}
		else if (e.getSource()==Eleve)
		{
			monPanel = new GestionEleve();
			monPanel.setVisible(true);
			this.getContentPane().add(monPanel);
			this.setVisible(true);
			
		}
		else if (e.getSource()==Professeur)
		{
			monPanel = new GestionProfesseur();
			monPanel.setVisible(true);
			this.getContentPane().add(monPanel);
			this.setVisible(true);
		}	
		else if (e.getSource()==AjouterEleve)
		{
			new AjoutEleve();
		}
		else if (e.getSource()==AjouterProfesseur)
		{
			new AjoutProfesseur();
		}
		
	}
}

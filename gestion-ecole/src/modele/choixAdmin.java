/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class choixAdmin extends JFrame {
    JLabel titre= new JLabel("Que voulez-vous faire ?");
    JButton bouton1 = new JButton("Gérer les professeurs");
    JButton bouton2 =new JButton("Gérer les élèves");
    JButton bouton3 =new JButton("Reporting");
    public choixAdmin(){
        this.setTitle("Choix de l'administrateur");
	this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        JPanel cell1=new JPanel();
        JPanel cell2=new JPanel();
        JPanel cell3=new JPanel();
        JPanel content=new JPanel();
         bouton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechercheProfAdmin rec2= new rechercheProfAdmin();
            }
        });
          bouton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechercheEleveAdmin rec2= new rechercheEleveAdmin();
            }
        });
        cell1.setPreferredSize(new Dimension(600, 40));
        cell1.add(titre);
        cell2.setPreferredSize(new Dimension(600, 40));
        cell2.add(bouton1);
        cell3.setPreferredSize(new Dimension(600, 40));
        cell3.add(bouton2);

	content.setPreferredSize(new Dimension(300, 120));
        content.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        //La taille en hauteur et en largeur
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell1,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        gbc.gridx = 0;
        gbc.gridy = 1;
        //La taille en hauteur et en largeur
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell2,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        gbc.gridx = 0;
        gbc.gridy = 2;
        //La taille en hauteur et en largeur
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell3,gbc);

        this.setContentPane(content);
        this.setVisible(true);
    }
}

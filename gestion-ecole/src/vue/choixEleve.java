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

public class choixEleve extends JFrame {
    JButton bouton1 = new JButton("Bulletin du 1er trimestre");
    JButton bouton2 =new JButton("Bulletin du 2e trimestre");
    JButton bouton3 =new JButton("Bulletin du 3e trimestre");
    public choixEleve(){
        this.setTitle("Fenêtre de recherche");
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
                Bulletin1 b= new Bulletin1();            
            }
        });
        bouton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bulletin2 b= new Bulletin2();   
                
            }
        });
        bouton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bulletin3 b= new Bulletin3();   
                
            }
        });
        cell1.setPreferredSize(new Dimension(600, 40));
        cell1.add(bouton1);
        cell2.setPreferredSize(new Dimension(600, 40));
        cell2.add(bouton2);
        cell3.setPreferredSize(new Dimension(600, 40));
        cell3.add(bouton3);
        
	content.setPreferredSize(new Dimension(300, 120));
        content.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        //La taille en hauteur et en largeur
        gbc.gridheight = 1;
        gbc.gridwidth = 5;
        content.add(cell1,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.gridx=0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 5;
        content.add(cell2,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.gridx=0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 5;
        content.add(cell3,gbc);
        
        this.setContentPane(content);
        this.setVisible(true);
    }
}

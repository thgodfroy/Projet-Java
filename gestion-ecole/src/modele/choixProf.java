/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hugod
 */
public class choixProf extends JFrame {
    private final JPanel rec = new JPanel();
    JButton ajouter = new JButton("Ajouter une note");
    JButton supprimer =new JButton("Supprimer une note");
    public choixProf(){
        JPanel content=new JPanel();
        this.setTitle("Fenêtre de recherche");
	this.setSize(500, 250);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	JPanel cell1=new JPanel();
        JPanel cell2=new JPanel();
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AjoutNote rec2= new AjoutNote();            
            }
        });
        supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rechercheEleveAdmin rec2= new rechercheEleveAdmin();            
            }
        });
        cell1.setPreferredSize(new Dimension(600, 40));
        cell1.add(ajouter);
        cell2.setPreferredSize(new Dimension(600, 40));
        cell2.add(ajouter);
        content.setPreferredSize(new Dimension(300, 120));
        content.add(supprimer);
        content.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell1,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell2,gbc);
        
        this.setContentPane(content);
        this.setVisible(true);
    }
}

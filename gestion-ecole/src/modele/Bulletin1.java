/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Bulletin1 extends JFrame {
    public Bulletin1(){
        this.setTitle("Fenêtre de recherche eleve");
	this.setSize((500), 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        JButton bouton = new JButton("Retour");
        String[][] data ={
            
        };
        String titre[] = {"Matière","Note","Appréciation"}; 
        JTable bulletin = new JTable(data,titre);
        this.getContentPane().add(new JScrollPane(bulletin));
        
        
        this.setVisible(true);
    }
}

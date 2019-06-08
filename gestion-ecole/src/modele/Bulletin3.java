/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author hugod
 */
public class Bulletin3 extends JFrame {
    public Bulletin3(){
        this.setTitle("Fenêtre de recherche eleve");
	this.setSize((500), 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        String[][] data ={
            
        };
        String titre[] = {"Matière","Note","Appréciation"}; 
        JTable bulletin = new JTable(data,titre);
        this.getContentPane().add(new JScrollPane(bulletin));
        this.setVisible(true);
    }
}

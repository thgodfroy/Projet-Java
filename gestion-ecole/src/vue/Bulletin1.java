/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author hugod
 */
public class Bulletin1 extends JFrame {
    public Bulletin1(String nom,String prenom){
        this.setTitle("Bulletin 1 de "+nom+" "+prenom );
	this.setSize((500), 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
        String url="jdbc:mysql://localhost:3306/projetjava";
        String login="root";
        String mdp="";
        String sql;
        String sql1;
        String sql2;
        String sql3;
        try{
        Connection connexion = DriverManager.getConnection(url,login,mdp);
        Statement st = connexion.createStatement();
        sql="SELECT id_personne FROM personne WHERE nom='"+nom+"' AND prénom='"+prenom+"' AND type='Eleve' ";
        sql1="SELECT discipline FROM bulletin WHERE id_personne='"+sql+"' AND id-trimestre='1' ";
        
        
        sql2="SELECT moyenne FROM bulletin WHERE id_personne='"+sql+"' AND id-trimestre='1' ";
        
        sql3="SELECT appreciation FROM bulletin WHERE id_personne='"+sql+"' AND id-trimestre='1' ";
       
        
        
        String[][] data ={{sql1,sql2,sql3}
        };
        String titre[] = {"Matière","Note","Appréciation"}; 
        
        JTable bulletin = new JTable(data,titre);
        
        this.getContentPane().add(new JScrollPane(bulletin));
        
        this.setVisible(true);
        }catch(SQLException sqle){
                }
        
        
        this.setVisible(true);
    }
}

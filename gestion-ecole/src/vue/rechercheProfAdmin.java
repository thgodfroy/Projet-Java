/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import vue.choixAdmin;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

/**
 *
 * @author hugod
 */
public class rechercheProfAdmin extends JFrame implements MouseListener {
    JLabel name= new JLabel("Nom de famille");
    JLabel prename= new JLabel("Prenom");
    JLabel matiere = new JLabel("Discipline");
    JTextField text1 = new JTextField("Nom     ");
    JTextField text2 = new JTextField("Prenom  ");
    JTextField text3 = new JTextField("Discipline");
    JButton ajouter = new JButton("Ajouter");
    JButton retour = new JButton("Retour");
    JButton supprimer = new JButton("Supprimer");
    String sql;
    public rechercheProfAdmin(String nom,String prenom){
        this.setTitle("Recherche Prof de "+nom+" "+prenom);
        this.setSize(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        JPanel cell1= new JPanel();
        JPanel cell2= new JPanel();
        JPanel cell3= new JPanel();
        JPanel cell4= new JPanel();
        JPanel cell5= new JPanel();
        JPanel cell6= new JPanel();
        JPanel cell7= new JPanel();
        JPanel cell8= new JPanel();
        JPanel cell9= new JPanel();
        JPanel content = new JPanel();
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url="jdbc:mysql://localhost:3306/projetjava";
                String login="root";
                String mdp="";
                String entreenom=text1.getText();
                String entreeprenom=text2.getText();
                String entreemat=text3.getText();
                
                try{
                    Connection connexion = DriverManager.getConnection(url,login,mdp);
                    Statement st = connexion.createStatement();
                    sql = "INSERT INTO professeur VALUES (0,'"+entreenom+"','"+entreeprenom+"','Professeur','1')";
                    st.executeQuery(sql);
                    sql="SELECT id_personne FROM personne WHERE nom='"+entreenom+"' AND prénom='"+entreeprenom+"' ";
                    
                    sql = "INSERT INTO professeur VALUES (0,'"+entreenom+"','"+entreeprenom+"','"+sql+"','"+entreemat+"')";
                    st.executeQuery(sql);
            }catch(SQLException sqle){
                }
            }
        });
        supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url="jdbc:mysql://localhost:3306/projetjava";
                String login="root";
                String mdp="";
                String entreenom=text1.getText();
                String entreeprenom=text2.getText();
                String entreemat=text3.getText();
                
                try{
                    Connection connexion = DriverManager.getConnection(url,login,mdp);
                    
                    Statement st = connexion.createStatement();
                    sql="SELECT id_personne FROM personne WHERE nom='"+entreenom+"' AND prénom='"+entreeprenom+"' ";
                    
                    sql="DELETE FROM professeur WHERE nom='"+entreenom+"' AND prénom='"+entreeprenom+"' AND discipline='"+entreemat+"' AND id_personne='"+sql+"'";                  
                    ResultSet res  = st.executeQuery(sql);
                    sql="DELETE FROM personne WHERE nom='"+entreenom+"' AND prénom='"+entreeprenom+"'";
                    st.executeQuery(sql);
                    
            }catch(SQLException sqle){
                }
            }
            
        });
        retour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choixAdmin admin= new choixAdmin( nom, prenom);            
            }
        });
        
        cell1.setPreferredSize(new Dimension(100, 40));
        cell1.add(name);
        cell2.setPreferredSize(new Dimension(80, 40));
        cell2.add(text1);
        cell3.setPreferredSize(new Dimension(60, 40));
        cell3.add(prename);
        cell4.setPreferredSize(new Dimension(80, 40));
        cell4.add(text2);
        cell5.setPreferredSize(new Dimension(60, 40));
        cell5.add(matiere);
        cell6.setPreferredSize(new Dimension(80, 40));
        cell6.add(text3);
        cell7.setPreferredSize(new Dimension(120, 40));
        cell7.add(ajouter);
        cell8.setPreferredSize(new Dimension(120, 40));
        cell8.add(retour);
        cell9.setPreferredSize(new Dimension(120, 40));
        cell9.add(supprimer);
        
        content.setPreferredSize(new Dimension(300, 120));
        content.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        //La taille en hauteur et en largeur
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        // Ajout de cell1
        content.add(cell1, gbc);
        //Placement de cell2
        gbc.gridx=2;
        //Taille de cell2
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        //Ajout de cell2
        content.add(cell2,gbc);
        // Retour à la ligne
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell3,gbc);
        
        gbc.gridx=2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell4,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell5,gbc);
        
        gbc.gridx=2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell6,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.gridx=2;
        gbc.gridy=3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        content.add(cell7,gbc);
        
        gbc.gridx=0;
        gbc.gridy=3;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell8,gbc);
        
        gbc.gridx=3;
        gbc.gridy=3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        content.add(cell9,gbc);
        
        this.setContentPane(content);
	this.setVisible(true);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }


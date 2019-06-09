/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rechercheEleveAdmin extends JFrame implements MouseListener {
    
    JLabel nom=new JLabel("Entrez le nom de famille");
    JTextField text1= new JTextField("nom");
    JLabel prenom=new JLabel("Entrez le prenom");
    JTextField text2= new JTextField("prenom");
    JLabel classe=new JLabel("Entrez la classe");
    JTextField text3= new JTextField("classe");
    JLabel promo=new JLabel("Entrez la promotion");
    JTextField text4= new JTextField("promotion");
    JButton ajouter=new JButton("Ajouter");
    JButton supprimer=new JButton("Supprimer");
    JButton retour=new JButton("Retour");
    public rechercheEleveAdmin(){
        this.setTitle("Fenêtre de recherche eleve");
	this.setSize((500), 250);
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
        JPanel cell10=new JPanel();
        JPanel cell11= new JPanel();
        JPanel content= new JPanel();
        ajouter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                          
            }
        });
        supprimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                            
            }
        });
        retour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                choixAdmin admin= new choixAdmin();            
            }
        });
        
        cell1.setPreferredSize(new Dimension(600, 40));
        cell1.add(nom);
        cell2.setPreferredSize(new Dimension(80, 40));
        cell2.add(text1);
        cell3.setPreferredSize(new Dimension(600, 40));
        cell3.add(prenom);
        cell4.setPreferredSize(new Dimension(80, 40));
        cell4.add(text2);
	cell5.setPreferredSize(new Dimension(600, 40));
        cell5.add(classe);    
        cell6.setPreferredSize(new Dimension(80, 40));
        cell6.add(text3);
        cell7.setPreferredSize(new Dimension(600, 40));
        cell7.add(promo);
        cell8.setPreferredSize(new Dimension(80, 40));
        cell8.add(text4);
        cell9.setPreferredSize(new Dimension(600, 40));
        cell9.add(ajouter);
        cell10.setPreferredSize(new Dimension(600, 40));
        cell10.add(retour);
        cell11.setPreferredSize(new Dimension(600, 40));
        cell11.add(supprimer);
        
        content.setPreferredSize(new Dimension(300, 120));
        content.setLayout(new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell1,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell2,gbc);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell3,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell4,gbc);
        
        
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell5,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell6,gbc);
       
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell7,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 3;
        content.add(cell8,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        content.add(cell10,gbc);
        
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        content.add(cell9,gbc);
        
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        content.add(cell11,gbc);
        
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

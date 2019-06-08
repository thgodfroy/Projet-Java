package vue;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class fenetre extends JFrame implements MouseListener,ActionListener {
	
        
        private final JComboBox combo=new JComboBox();
        private final JTextField text1= new JTextField("Identifiant");
        private final JTextField text2= new JTextField("Mot de passe");
        private final JButton connexion =new JButton("Connexion");
        
	  public fenetre() {
	    this.setTitle("Ma fenêtre");
            this.setSize(500, 250);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            JPanel cell1=new JPanel();
            JPanel cell2=new JPanel();
            JPanel cell3=new JPanel();
            JPanel cell4=new JPanel();
            JPanel cell5=new JPanel();
            JPanel cell6=new JPanel();
            JPanel cell7=new JPanel();
            JPanel content=new JPanel();
            cell1.setPreferredSize(new Dimension(60, 40));
            cell1.add(new JLabel("Identifiant"));
            cell2.setPreferredSize(new Dimension(60, 40));
	    cell2.add(text1);
            cell3.setPreferredSize(new Dimension(100, 40));
	    cell3.add(new JLabel("Mot de Passe"));
            cell4.setPreferredSize(new Dimension(80, 40));
	    cell4.add(text2);
            cell5.setPreferredSize(new Dimension(100, 40));
	    cell5.add(new JLabel("Statut"));
            cell6.setPreferredSize(new Dimension(100, 40));
            combo.addItem("Statut");
            combo.addItem("Eleve");
            combo.addItem("Professeur");
            combo.addItem("Admin");
	    cell6.add(combo);
            cell5.setPreferredSize(new Dimension(100, 40));
	    cell7.add(connexion);
            
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
            gbc.gridy=2;
            gbc.gridheight = 1;
            gbc.gridwidth = 2;
            content.add(cell6,gbc);
            
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.gridx=2;
            gbc.gridy=3;
            gbc.gridheight = 1;
            gbc.gridwidth = 2;
            content.add(cell7,gbc);
            
	    this.setContentPane(content);
	    this.setVisible(true);
	    //Au centre
            
	  }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
        @Override
        public void actionPerformed(ActionEvent e){
            String id = text1.getText();
            String mdp = text2.getText();
            String statut= (String) combo.getSelectedItem();
        }

    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Celeste
 */
public class GebruikersToevoegen extends JPanel implements ActionListener{
    
      private JButton opslaan;
      private JTextField tbNaam, tbGebruikersNaam;
      private JPasswordField tbWw, tbWwHerhaal;
      private JComboBox cbRecht;
      private JLabel lbNaam, lbGebruikersNaam, lbRecht, lbWw, lbWwHerhaal;
    
    public GebruikersToevoegen(){
        initControls();
    }
    
    private void initControls() {
        setLayout(new FlowLayout());
        lbNaam = new JLabel("Naam:");
        tbNaam = new JTextField(10);
        lbGebruikersNaam = new JLabel("Gebruikersnaam:");
        tbGebruikersNaam = new JTextField(10);
        lbRecht = new JLabel("Rechten:");
        cbRecht = new JComboBox();
             cbRecht.addItem("recht1");
             cbRecht.addItem("recht2");
        lbWw = new JLabel("Wachtwoord:");
        tbWw = new JPasswordField(10);
        lbWwHerhaal = new JLabel("Wachtwoord herhalen:");
        tbWwHerhaal = new JPasswordField(10);
        opslaan= new JButton("Opslaan");
       
        add(lbNaam);
        add(tbNaam);
        add(lbGebruikersNaam);
        add(tbGebruikersNaam);
        add(lbRecht);
        add(cbRecht);
        add(lbWw);
        add(tbWw);
        add(lbWwHerhaal);
        add(tbWwHerhaal);
        add(opslaan);
        
        opslaan.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String user = tbGebruikersNaam.getText();
        String naam = tbNaam.getText();
        String ww = tbWw.getText();
        String ww2 = tbWwHerhaal.getText();
        String pass;
        if(ww.equals(ww2)){
            pass = ww;
        }
        else{
            JOptionPane.showMessageDialog(null, "Wachtwoorden komen niet overeen!", "Error", 1);
        }       
                
    }
}

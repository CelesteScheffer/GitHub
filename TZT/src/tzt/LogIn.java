/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Celeste
 */
public class LogIn extends JDialog implements ActionListener {

    private JButton logIn;
    private JTextField tbGebruiker;
    private JLabel lbGebruiker, lbWw;
    private JPasswordField tbWw;

    public LogIn() {
        setTitle("Log in");
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        setSize(180, 200);
        setModal(true);
        setResizable(false);
        initControls();
        setVisible(true);
    }

    private void initControls() {
        setLocationRelativeTo(null); //zet de dialoog midden op het scherm
        setLayout(new FlowLayout());
        lbGebruiker = new JLabel("Gebruikersnaam:");
        tbGebruiker = new JTextField(10);
        lbWw = new JLabel("Wachtwoord:");
        tbWw = new JPasswordField(10);
        logIn = new JButton("Log in");
        add(lbGebruiker);
        add(tbGebruiker);
        add(lbWw);
        add(tbWw);
        add(logIn);

        logIn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == logIn) {
            String user = tbGebruiker.getText();
            String strpass = tbWw.getText();
            Gebruiker g = null;
            try {
                ArrayList<WhereStatement> ws = new ArrayList<>();
                WhereStatement whereNaam = new WhereStatement("Gebruikersnaam", user);
                WhereStatement whereWw = new WhereStatement("Wachtwoord", strpass);
                ws.add(whereNaam);
                ws.add(whereWw);
                g = (Gebruiker) Database.getDatabase().selectOne("Gebruiker", ws);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);
            }
            if (g == null) {
                JOptionPane.showMessageDialog(null, "Login Unsuccessful!", "Error", 1);
            }
            else{
                dispose();
            }
        }
    }
}

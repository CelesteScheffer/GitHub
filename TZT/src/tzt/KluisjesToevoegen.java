/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Wisse
 */
public class KluisjesToevoegen extends JPanel implements ActionListener {

    private JPanel panelKluisjesToevoegen;

    public void createKluisjesToevoegen() {
        panelKluisjesToevoegen = new JPanel();
        JLabel jlNieuwKluisje = new JLabel("Nieuw Kluisje Toevoegen:");
        JLabel jlKluisjesnummer = new JLabel("Kluisjesnummer*");
        JTextField tfKluisjesnummer = new JTextField(20);
        JLabel jlKluisjesLocatie = new JLabel("Locatie kluisje*");
        JTextField tfKluisjesLocatie = new JTextField(20);
        JButton jbKluisjeToevoegen = new JButton("Kluisje toevoegen");
    }

    public KluisjesToevoegen() {
        setLayout(new FlowLayout());
        this.createKluisjesToevoegen();
        add(panelKluisjesToevoegen);
    }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

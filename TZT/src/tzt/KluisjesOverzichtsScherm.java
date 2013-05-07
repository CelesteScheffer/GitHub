/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Wisse
 */
public class KluisjesOverzichtsScherm extends GebruikersScherm{
    
    public KluisjesOverzichtsScherm() {
        this.setLayout(new GridLayout(2,1));
        JPanel panelKluisjesToevoegen = new JPanel();
        JPanel panelKluisjesLijst = new JPanel();
        KluisjesToevoegen KluisjesToevoegen = new KluisjesToevoegen();
        panelKluisjesToevoegen.add(KluisjesToevoegen);
        KluisjesLijst KluisjesLijst = new KluisjesLijst();
        panelKluisjesLijst.add(KluisjesLijst);
        add(panelKluisjesToevoegen);
        add(panelKluisjesLijst);
    }
    
}

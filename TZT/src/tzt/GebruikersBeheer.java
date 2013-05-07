/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Celeste
 */
public class GebruikersBeheer extends GebruikersScherm{
    
     JPanel overzicht = new GebruikersOverzicht();
     JPanel toevoegen = new GebruikersToevoegen();
     
    public GebruikersBeheer(){
         this.setLayout(new GridLayout(2,1));
        add(overzicht);
        //add(toevoegen);
        
    }
}

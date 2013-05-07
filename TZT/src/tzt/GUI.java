/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Celeste

 */
public class GUI extends JFrame {

    protected int ingelogd = 0;
    
    public GUI() {
        super();
        setExtendedState(JFrame.MAXIMIZED_BOTH);  //semi fullscreen
        setTitle("TZT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        
      // if (ingelogd==0){
       //     LogIn lg = new LogIn();
     //  }
       
        //orderscherm
        //GebruikersScherm gebruikersScherm = new OrdersScherm();
       
       GebruikersScherm gebruikersScherm = new GebruikersBeheer();
       add(gebruikersScherm);
       setVisible(true); 

            
       }

    }

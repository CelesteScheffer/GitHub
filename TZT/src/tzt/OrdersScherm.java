/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rudy
 */
public class OrdersScherm extends GebruikersScherm {
    
    
    public OrdersScherm() {
        this.setLayout(new GridLayout(2,1));
        JPanel panelOrderInvoer = new JPanel();
        JPanel panelOrderLijst = new JPanel();
        OrderInvoer orderInvoer = new OrderInvoer();
        panelOrderInvoer.add(orderInvoer);
        OrderLijst orderLijst = new OrderLijst();
        panelOrderLijst.add(orderLijst);
        add(panelOrderInvoer);
        add(panelOrderLijst);
    }
}

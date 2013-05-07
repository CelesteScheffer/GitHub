/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Celeste
 */
public class GebruikersOverzicht extends JPanel {

    private String naam;
    private String recht;

    public GebruikersOverzicht() {

        String[] columnNames = {"Naam",
            "Recht(en)",
            "",
            ""};
        Object[][] data = {
            {"Kathy", "Smith",
                "w", "x"},
            {"John", "Doe",
                "w", "x"}};
        JTable table = new JTable(data, columnNames);
       JTableHeader header = table.getTableHeader();
       setLayout(new BorderLayout());
       add(header, BorderLayout.NORTH);
       add(table, BorderLayout.CENTER);

        try {
            ArrayList<Entiteit> g = Database.getDatabase().select("Gebruiker");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 1);

        }


    }
}

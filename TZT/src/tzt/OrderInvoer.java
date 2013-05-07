/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tzt;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Rudy
 */
public class OrderInvoer extends JPanel implements ActionListener {
    
    private JPanel panelOrderInvoerVerzender;
    private JPanel panelOrderInvoerOntvanger;
    private JPanel panelOrderInvoerDetails;
    private JPanel panelOrderInvoer;
    
    public void createVerzenderInvoer() {
        panelOrderInvoerVerzender = new JPanel();
        JLabel jlVerzender = new JLabel("Verzender:");
        JLabel jlNaamVerzender = new JLabel("Naam*");
        JTextField tfNaamVerzender = new JTextField(20);
        JLabel jlStraatVerzender = new JLabel("Straat*");
        JTextField tfStraatVerzender = new JTextField(15);
        JLabel jlHsnrVerzender = new JLabel("Hsnr.*");
        JTextField tfHsnrVerzender = new JTextField(3);
        JLabel jlPostcodeVerzender = new JLabel("Postcode*");
        JTextField tfPostcodeVerzenderCijfers = new JTextField(7);
        JTextField tfPostcodeVerzenderLetters = new JTextField(3);
        JLabel jlPlaatsVerzender = new JLabel("Plaats*");
        JTextField tfPlaatsVerzender = new JTextField(10);
        JLabel jlRekeningnummerVerzender = new JLabel("Rekeningnr.*");
        JTextField tfRekeningnummerVerzender = new JTextField(20);
<<<<<<< HEAD

=======
        
        
        panelOrderInvoerVerzender.add(jlVerzender);
        panelOrderInvoerVerzender.add(jlNaamVerzender);
        panelOrderInvoerVerzender.add(tfNaamVerzender);
        panelOrderInvoerVerzender.add(jlStraatVerzender);
        panelOrderInvoerVerzender.add(tfStraatVerzender);
        panelOrderInvoerVerzender.add(jlHsnrVerzender);
        panelOrderInvoerVerzender.add(tfHsnrVerzender);
        panelOrderInvoerVerzender.add(jlPostcodeVerzender);
        panelOrderInvoerVerzender.add(tfPostcodeVerzenderCijfers);
        panelOrderInvoerVerzender.add(tfPostcodeVerzenderLetters);
        panelOrderInvoerVerzender.add(jlPlaatsVerzender);
        panelOrderInvoerVerzender.add(tfPlaatsVerzender);
        panelOrderInvoerVerzender.add(jlRekeningnummerVerzender);
        panelOrderInvoerVerzender.add(tfRekeningnummerVerzender);
        
>>>>>>> development
        GroupLayout layout = new GroupLayout(panelOrderInvoerVerzender);
        panelOrderInvoerVerzender.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlVerzender)
                .addComponent(jlNaamVerzender)
                .addComponent(jlStraatVerzender)
                .addComponent(jlPostcodeVerzender)
                .addComponent(jlPlaatsVerzender)
                .addComponent(jlRekeningnummerVerzender))
                .addGroup(layout.createParallelGroup()
                .addComponent(tfNaamVerzender)
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfStraatVerzender)
                .addComponent(jlHsnrVerzender)
                .addComponent(tfHsnrVerzender))
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfPostcodeVerzenderCijfers)
                .addComponent(tfPostcodeVerzenderLetters))
                .addComponent(tfPlaatsVerzender)
                .addComponent(tfRekeningnummerVerzender)));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addComponent(jlVerzender)
                .addGroup(layout.createParallelGroup()
                .addComponent(jlNaamVerzender)
                .addComponent(tfNaamVerzender))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlStraatVerzender)
                .addComponent(tfStraatVerzender)
                .addComponent(jlHsnrVerzender)
                .addComponent(tfHsnrVerzender))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlPostcodeVerzender)
                .addComponent(tfPostcodeVerzenderCijfers)
                .addComponent(tfPostcodeVerzenderLetters))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlPlaatsVerzender)
                .addComponent(tfPlaatsVerzender))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlRekeningnummerVerzender)
                .addComponent(tfRekeningnummerVerzender)));
    }
    
    public void createOntvangerInvoer() {
        panelOrderInvoerOntvanger = new JPanel();
        JLabel jlOntvanger = new JLabel("Ontvanger:");
        JLabel jlNaamOntvanger = new JLabel("Naam*");
        JTextField tfNaamOntvanger = new JTextField(20);
        JLabel jlStraatOntvanger = new JLabel("Straat*");
        JTextField tfStraatOntvanger = new JTextField(15);
        JLabel jlHsnrOntvanger = new JLabel("Hsnr.*");
        JTextField tfHsnrOntvanger = new JTextField(3);
        JLabel jlPostcodeOntvanger = new JLabel("Postcode*");
        JTextField tfPostcodeOntvangerCijfers = new JTextField(7);
        JTextField tfPostcodeOntvangerLetters = new JTextField(3);
        JLabel jlPlaatsOntvanger = new JLabel("Plaats*");
        JTextField tfPlaatsOntvanger = new JTextField(10);
<<<<<<< HEAD

=======
        
        panelOrderInvoerOntvanger.add(jlOntvanger);
        panelOrderInvoerOntvanger.add(jlNaamOntvanger);
        panelOrderInvoerOntvanger.add(tfNaamOntvanger);
        panelOrderInvoerOntvanger.add(jlStraatOntvanger);
        panelOrderInvoerOntvanger.add(tfStraatOntvanger);
        panelOrderInvoerOntvanger.add(jlHsnrOntvanger);
        panelOrderInvoerOntvanger.add(tfHsnrOntvanger);
        panelOrderInvoerOntvanger.add(jlPostcodeOntvanger);
        panelOrderInvoerOntvanger.add(tfPostcodeOntvangerCijfers);
        panelOrderInvoerOntvanger.add(tfPostcodeOntvangerLetters);
        panelOrderInvoerOntvanger.add(jlPlaatsOntvanger);
        panelOrderInvoerOntvanger.add(tfPlaatsOntvanger);
        
>>>>>>> development
        GroupLayout layout = new GroupLayout(panelOrderInvoerOntvanger);
        panelOrderInvoerOntvanger.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlOntvanger)
                .addComponent(jlNaamOntvanger)
                .addComponent(jlStraatOntvanger)
                .addComponent(jlPostcodeOntvanger)
                .addComponent(jlPlaatsOntvanger))
                .addGroup(layout.createParallelGroup()
                .addComponent(tfNaamOntvanger)
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfStraatOntvanger)
                .addComponent(jlHsnrOntvanger)
                .addComponent(tfHsnrOntvanger))
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfPostcodeOntvangerCijfers)
                .addComponent(tfPostcodeOntvangerLetters))
                .addComponent(tfPlaatsOntvanger)));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addComponent(jlOntvanger)
                .addGroup(layout.createParallelGroup()
                .addComponent(jlNaamOntvanger)
                .addComponent(tfNaamOntvanger))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlStraatOntvanger)
                .addComponent(tfStraatOntvanger)
                .addComponent(jlHsnrOntvanger)
                .addComponent(tfHsnrOntvanger))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlPostcodeOntvanger)
                .addComponent(tfPostcodeOntvangerCijfers)
                .addComponent(tfPostcodeOntvangerLetters))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlPlaatsOntvanger)
                .addComponent(tfPlaatsOntvanger)));
    }
    
    public void createDetailsInvoer() {
        panelOrderInvoerDetails = new JPanel();
        JLabel jlDatum = new JLabel("Datum*");
        JTextField tfDatum = new JTextField(10);
        JLabel jlTijd = new JLabel("Tijd*");
        JTextField tfTijd = new JTextField(10);
        JLabel jlGroottePakket = new JLabel("Grootte pakket (cm):");
        JLabel jlLengtePakket = new JLabel("Lengte*");
        JTextField tfLengtePakket = new JTextField(3);
        JLabel jlBreedtePakket = new JLabel("Breedte*");
        JTextField tfBreedtePakket = new JTextField(3);
        JLabel jlHoogtePakket = new JLabel("Hoogte*");
        JTextField tfHoogtePakket = new JTextField(3);
        JLabel jlFormatGrootte = new JLabel("PBS-max: 40x30x40cm");
        JButton jbOrderToevoegen = new JButton("Order toevoegen");
<<<<<<< HEAD

        GroupLayout layout = new GroupLayout(panelOrderInvoerDetails);
        panelOrderInvoerDetails.setLayout(layout);


        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlDatum)
                .addComponent(jlTijd)
                .addComponent(jlGroottePakket)
                .addComponent(jlLengtePakket)
                .addComponent(jlFormatGrootte))
                .addGroup(layout.createParallelGroup()
                .addComponent(tfDatum)
                .addComponent(tfTijd)
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfLengtePakket)
                .addComponent(jlBreedtePakket)))
                .addGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfBreedtePakket)
                .addComponent(jlHoogtePakket)
                .addComponent(tfHoogtePakket))
                .addComponent(jbOrderToevoegen)));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlDatum)
                .addComponent(tfDatum))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlTijd)
                .addComponent(tfTijd))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlGroottePakket))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlLengtePakket)
                .addComponent(tfLengtePakket)
                .addComponent(jlBreedtePakket)
                .addComponent(tfBreedtePakket)
                .addComponent(jlHoogtePakket)
                .addComponent(tfHoogtePakket))
                .addComponent(jlFormatGrootte)
                .addComponent(jbOrderToevoegen));
    }
=======
        
        
        panelOrderInvoerDetails.add(jlDatum);
        panelOrderInvoerDetails.add(tfDatum);
        panelOrderInvoerDetails.add(jlTijd);
        panelOrderInvoerDetails.add(tfTijd);
        panelOrderInvoerDetails.add(jlGroottePakket);
        panelOrderInvoerDetails.add(jlLengtePakket);
        panelOrderInvoerDetails.add(tfLengtePakket);
        panelOrderInvoerDetails.add(jlBreedtePakket);
        panelOrderInvoerDetails.add(tfBreedtePakket);
        panelOrderInvoerDetails.add(jlHoogtePakket);
        panelOrderInvoerDetails.add(tfHoogtePakket);
        panelOrderInvoerDetails.add(jlFormatGrootte);
        panelOrderInvoerDetails.add(jbOrderToevoegen);
        
        GroupLayout layout = new GroupLayout(panelOrderInvoerDetails);
        panelOrderInvoerDetails.setLayout(layout);

>>>>>>> development

//        layout.setHorizontalGroup(
//                layout.createSequentialGroup()
//                .addGroup(layout.createParallelGroup()
//                .addGroup(layout.createSequentialGroup()
//                .addComponent(jlDatum)
//                .addComponent(tfDatum))
//                .addGroup(layout.createSequentialGroup()
//                .addComponent(jlTijd)
//                .addComponent(tfTijd))
//                .addComponent(jlGroottePakket)
//                .addGroup(layout.createSequentialGroup()
//                .addComponent(jlLengtePakket)
//                .addComponent(tfLengtePakket)
//                .addComponent(jlBreedtePakket))
//                .addComponent(jlFormatGrootte))
//                .addGroup(layout.createParallelGroup()
//                .addGroup(layout.createSequentialGroup()
//                .addComponent(tfBreedtePakket)
//                .addComponent(jlHoogtePakket)
//                .addComponent(tfHoogtePakket))
//                .addComponent(jbOrderToevoegen)));
//        layout.setVerticalGroup(
//                layout.createSequentialGroup()
//                .addGroup(layout.createParallelGroup()
//                .addComponent(jlDatum)
//                .addComponent(tfDatum))
//                .addGroup(layout.createParallelGroup()
//                .addComponent(jlTijd)
//                .addComponent(tfTijd))
//                .addComponent(jlGroottePakket)
//                .addGroup(layout.createParallelGroup()
//                .addComponent(jlLengtePakket)
//                .addComponent(tfLengtePakket)
//                .addComponent(jlBreedtePakket)
//                .addComponent(tfBreedtePakket)
//                .addComponent(jlHoogtePakket)
//                .addComponent(tfHoogtePakket))
//                .addComponent(jlFormatGrootte)
//                .addComponent(jbOrderToevoegen));
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlDatum)
                .addComponent(jlTijd)
                .addComponent(jlGroottePakket)
                .addComponent(jlLengtePakket)
                .addComponent(jlFormatGrootte))
                .addGroup(layout.createParallelGroup()
                .addComponent(tfDatum)
                .addComponent(tfTijd)
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfLengtePakket)
                .addComponent(jlBreedtePakket)))
                .addGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                .addComponent(tfBreedtePakket)
                .addComponent(jlHoogtePakket)
                .addComponent(tfHoogtePakket))
                .addComponent(jbOrderToevoegen)));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlDatum)
                .addComponent(tfDatum))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlTijd)
                .addComponent(tfTijd))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlGroottePakket))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlLengtePakket)
                .addComponent(tfLengtePakket)
                .addComponent(jlBreedtePakket)
                .addComponent(tfBreedtePakket)
                .addComponent(jlHoogtePakket)
                .addComponent(tfHoogtePakket))
                .addComponent(jlFormatGrootte)
                .addComponent(jbOrderToevoegen));
    }
    
    public OrderInvoer() {
        setLayout(new BorderLayout());
        panelOrderInvoer = new JPanel();
        JButton jbHideOrderInvoer = new JButton("...");
        this.createVerzenderInvoer();
        this.createOntvangerInvoer();
        this.createDetailsInvoer();
        panelOrderInvoer.setLayout(new GridLayout(1, 3));
        panelOrderInvoer.add(panelOrderInvoerVerzender);
        panelOrderInvoer.add(panelOrderInvoerOntvanger);
        panelOrderInvoer.add(panelOrderInvoerDetails);
        add(panelOrderInvoer, BorderLayout.CENTER);
        add(jbHideOrderInvoer, BorderLayout.SOUTH);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

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
public class OrderLijst extends JPanel implements ActionListener {

    private JPanel panelOrderZoeken;
    private JPanel panelOrderZoekknoppen;
    private JPanel panelOrderGeavanceerdZoeken;
    private JPanel panelZoekenVerzender;
    private JPanel panelZoekenOntvanger;
    private JPanel panelZoekenDetails;
    private JPanel panelZoekenCheckboxes;
    private JPanel panelOrderLijst;

    public void createOrderZoekknoppen() {
        panelOrderZoekknoppen = new JPanel();
        JButton jbGisteren = new JButton("Gisteren");
        JButton jbVandaag = new JButton("Vandaag");
        JButton jbMorgen = new JButton("Morgen");
        JButton jbGeavanceerdZoeken = new JButton("Geavanceerd zoeken");

        panelOrderZoekknoppen.setLayout(new GridLayout(1, 7));
        panelOrderZoekknoppen.add(jbGisteren);
        panelOrderZoekknoppen.add(new JLabel(""));
        panelOrderZoekknoppen.add(jbVandaag);
        panelOrderZoekknoppen.add(new JLabel(""));
        panelOrderZoekknoppen.add(jbMorgen);
        panelOrderZoekknoppen.add(new JLabel(""));
        panelOrderZoekknoppen.add(jbGeavanceerdZoeken);
    }

    public void createZoekenVerzender() {
        panelZoekenVerzender = new JPanel();
        JLabel jlVerzender = new JLabel("Verzender:");
        JLabel jlNaamVerzender = new JLabel("Naam");
        JTextField tfNaamVerzender = new JTextField(20);
        JLabel jlStraatVerzender = new JLabel("Straat");
        JTextField tfStraatVerzender = new JTextField(15);
        JLabel jlHsnrVerzender = new JLabel("Hsnr.");
        JTextField tfHsnrVerzender = new JTextField(3);
        JLabel jlPostcodeVerzender = new JLabel("Postcode");
        JTextField tfPostcodeVerzenderCijfers = new JTextField(7);
        JTextField tfPostcodeVerzenderLetters = new JTextField(3);
        JLabel jlPlaatsVerzender = new JLabel("Plaats");
        JTextField tfPlaatsVerzender = new JTextField(10);
        JLabel jlRekeningnummerVerzender = new JLabel("Rekeningnr.");
        JTextField tfRekeningnummerVerzender = new JTextField(20);


        panelZoekenVerzender.add(jlVerzender);
        panelZoekenVerzender.add(jlNaamVerzender);
        panelZoekenVerzender.add(tfNaamVerzender);
        panelZoekenVerzender.add(jlStraatVerzender);
        panelZoekenVerzender.add(tfStraatVerzender);
        panelZoekenVerzender.add(jlHsnrVerzender);
        panelZoekenVerzender.add(tfHsnrVerzender);
        panelZoekenVerzender.add(jlPostcodeVerzender);
        panelZoekenVerzender.add(tfPostcodeVerzenderCijfers);
        panelZoekenVerzender.add(tfPostcodeVerzenderLetters);
        panelZoekenVerzender.add(jlPlaatsVerzender);
        panelZoekenVerzender.add(tfPlaatsVerzender);
        panelZoekenVerzender.add(jlRekeningnummerVerzender);
        panelZoekenVerzender.add(tfRekeningnummerVerzender);

        GroupLayout layout = new GroupLayout(panelZoekenVerzender);
        panelZoekenVerzender.setLayout(layout);
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

    public void createZoekenOntvanger() {
        panelZoekenOntvanger = new JPanel();
        JLabel jlOntvanger = new JLabel("Ontvanger:");
        JLabel jlNaamOntvanger = new JLabel("Naam");
        JTextField tfNaamOntvanger = new JTextField(20);
        JLabel jlStraatOntvanger = new JLabel("Straat");
        JTextField tfStraatOntvanger = new JTextField(15);
        JLabel jlHsnrOntvanger = new JLabel("Hsnr.");
        JTextField tfHsnrOntvanger = new JTextField(3);
        JLabel jlPostcodeOntvanger = new JLabel("Postcode");
        JTextField tfPostcodeOntvangerCijfers = new JTextField(7);
        JTextField tfPostcodeOntvangerLetters = new JTextField(3);
        JLabel jlPlaatsOntvanger = new JLabel("Plaats");
        JTextField tfPlaatsOntvanger = new JTextField(10);

        panelZoekenOntvanger.add(jlOntvanger);
        panelZoekenOntvanger.add(jlNaamOntvanger);
        panelZoekenOntvanger.add(tfNaamOntvanger);
        panelZoekenOntvanger.add(jlStraatOntvanger);
        panelZoekenOntvanger.add(tfStraatOntvanger);
        panelZoekenOntvanger.add(jlHsnrOntvanger);
        panelZoekenOntvanger.add(tfHsnrOntvanger);
        panelZoekenOntvanger.add(jlPostcodeOntvanger);
        panelZoekenOntvanger.add(tfPostcodeOntvangerCijfers);
        panelZoekenOntvanger.add(tfPostcodeOntvangerLetters);
        panelZoekenOntvanger.add(jlPlaatsOntvanger);
        panelZoekenOntvanger.add(tfPlaatsOntvanger);

        GroupLayout layout = new GroupLayout(panelZoekenOntvanger);
        panelZoekenOntvanger.setLayout(layout);
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

    public void createZoekenDetails() {
        panelZoekenDetails = new JPanel();
        JLabel jlDatum = new JLabel("Datum");
        JTextField tfDatum = new JTextField(10);
        JLabel jlTijd = new JLabel("Tijd");
        JTextField tfTijd = new JTextField(10);
        JLabel jlGroottePakket = new JLabel("Grootte pakket (cm):");
        JLabel jlLengtePakket = new JLabel("Lengte");
        JTextField tfLengtePakket = new JTextField(3);
        JLabel jlBreedtePakket = new JLabel("Breedte");
        JTextField tfBreedtePakket = new JTextField(3);
        JLabel jlHoogtePakket = new JLabel("Hoogte");
        JTextField tfHoogtePakket = new JTextField(3);
        JLabel jlFormatGrootte = new JLabel("PBS-max: 40x30x40cm");



        panelZoekenDetails.add(jlDatum);
        panelZoekenDetails.add(tfDatum);
        panelZoekenDetails.add(jlTijd);
        panelZoekenDetails.add(tfTijd);
        panelZoekenDetails.add(jlGroottePakket);
        panelZoekenDetails.add(jlLengtePakket);
        panelZoekenDetails.add(tfLengtePakket);
        panelZoekenDetails.add(jlBreedtePakket);
        panelZoekenDetails.add(tfBreedtePakket);
        panelZoekenDetails.add(jlHoogtePakket);
        panelZoekenDetails.add(tfHoogtePakket);
        panelZoekenDetails.add(jlFormatGrootte);


        GroupLayout layout = new GroupLayout(panelZoekenDetails);
        panelZoekenDetails.setLayout(layout);


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
                .addComponent(tfHoogtePakket))));
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
                .addComponent(jlFormatGrootte));
    }

    public void createZoekenCheckboxes() {
        panelZoekenCheckboxes = new JPanel();
        JLabel jlStatus = new JLabel("Status");
        JCheckBox cbNogNietOpgehaald = new JCheckBox("Nog niet opgehaald");
        JCheckBox cbOnderweg = new JCheckBox("Onderweg");
        JCheckBox cbOpgeslagen = new JCheckBox("Opgeslagen");
        JCheckBox cbAfgeleverd = new JCheckBox("Afgeleverd");
        JLabel jlVerzendwijze = new JLabel("Verzendwijze");
        JCheckBox cbTransportdienst = new JCheckBox("Transportdienst");
        JCheckBox cbTreinkoerier = new JCheckBox("Treinkoerier");
        JLabel jlOnkosten = new JLabel("Onkosten");
        JCheckBox cb0tot5 = new JCheckBox("€0 - 5");
        JCheckBox cb5tot10 = new JCheckBox("€5 - 10");
        JCheckBox cb10tot15 = new JCheckBox("€10 - 15");
        JCheckBox cb15tot20 = new JCheckBox("€15 - 20");
        JCheckBox cb20tot25 = new JCheckBox("€20 - 25");
        JCheckBox cbMeerDan25 = new JCheckBox("> €025");
        JButton jbZoeken = new JButton("Zoeken");

        GroupLayout layout = new GroupLayout(panelZoekenCheckboxes);
        panelZoekenCheckboxes.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlStatus)
                .addComponent(cbNogNietOpgehaald)
                .addComponent(cbOnderweg)
                .addComponent(cbOpgeslagen)
                .addComponent(cbAfgeleverd))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlVerzendwijze)
                .addComponent(cbTransportdienst)
                .addComponent(cbTreinkoerier))
                .addGroup(layout.createParallelGroup()
                .addComponent(jlOnkosten)
                .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(cb0tot5)
                .addComponent(cb5tot10)
                .addComponent(cb10tot15))
                .addGroup(layout.createParallelGroup()
                .addComponent(cb15tot20)
                .addComponent(cb20tot25)
                .addComponent(cbMeerDan25))))
                .addComponent(jbZoeken));
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                .addComponent(jlStatus)
                .addComponent(jlVerzendwijze)
                .addComponent(jlOnkosten))
                .addGroup(layout.createParallelGroup()
                .addComponent(cbNogNietOpgehaald)
                .addComponent(cbTransportdienst)
                .addComponent(cb0tot5)
                .addComponent(cb15tot20))
                .addGroup(layout.createParallelGroup()
                .addComponent(cbOnderweg)
                .addComponent(cbTreinkoerier)
                .addComponent(cb5tot10)
                .addComponent(cb20tot25))
                .addGroup(layout.createParallelGroup()
                .addComponent(cbOpgeslagen)
                .addComponent(cb10tot15)
                .addComponent(cbMeerDan25))
                .addGroup(layout.createParallelGroup()
                .addComponent(cbAfgeleverd)
                .addComponent(jbZoeken)));
    }

    public OrderLijst() {
        this.setLayout(new BorderLayout());
        panelOrderZoeken = new JPanel();
        panelOrderZoeken.setLayout(new BorderLayout());
        JLabel jlOrderoverzicht = new JLabel("Orderoverzicht");

        //Zoekknoppen
        this.createOrderZoekknoppen();
        panelOrderZoeken.add(panelOrderZoekknoppen, BorderLayout.NORTH);

        //Geavanceerd zoeken invoerveld
        panelOrderGeavanceerdZoeken = new JPanel();
        this.createZoekenVerzender();
        this.createZoekenOntvanger();
        this.createZoekenDetails();
        this.createZoekenCheckboxes();
        JPanel panelZoekenTop = new JPanel();
        JPanel panelZoekenBottom = new JPanel();
        panelOrderGeavanceerdZoeken.setLayout(new GridLayout(2, 1));
        panelOrderGeavanceerdZoeken.add(panelZoekenTop);
        panelOrderGeavanceerdZoeken.add(panelZoekenBottom);
        panelZoekenTop.setLayout(new GridLayout(1, 3));
        panelZoekenTop.add(panelZoekenVerzender);
        panelZoekenTop.add(panelZoekenOntvanger);
        panelZoekenTop.add(panelZoekenDetails);
        panelZoekenBottom.add(panelZoekenCheckboxes);
        panelOrderZoeken.add(panelOrderGeavanceerdZoeken, BorderLayout.CENTER);

        add(jlOrderoverzicht, BorderLayout.NORTH);
        add(panelOrderZoeken, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

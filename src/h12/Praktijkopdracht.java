package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Praktijkopdracht extends Applet {

    TextField tekstvak1, tekstvak2;
    Label label1, label2, labeltotaal;
    Button okKnop;
    int[] telefoonummers = new int[10];
    String[] namen = new String[10];
    int teller;
    boolean show = false;

    public void init() {
        label1 = new Label("Voer een naam in.");
        tekstvak1 = new TextField("Naam", 17);
        label2 = new Label("Voer het telefoonnummer in.");
        tekstvak2 = new TextField("Telefoonnummer", 20);
        labeltotaal = new Label("");
        okKnop = new Button("OK");
        okKnop.addActionListener(new OknopFunctie());

        add(label1);
        add(tekstvak1);
        add(label2);
        add(tekstvak2);
        add(okKnop);
        add(labeltotaal);
    }

    public void paint(Graphics g) {

        if (show) {

            for (int i = 0; i < namen.length; i++) {
                g.drawString(namen[i] + " " + telefoonummers[i], 25, 50 + i * 25);
            }
        }
    }

    class OknopFunctie implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // naam text
            String getNaam = tekstvak1.getText();
            //telefoonnummer text
            String getTelNummersTekst = tekstvak2.getText();
            int getTelnummersgetal = Integer.parseInt(getTelNummersTekst);

            if (teller < namen.length) {
                telefoonummers[teller] = getTelnummersgetal;
                namen[teller] = getNaam;
                teller++;

                labeltotaal.setSize(500, 1000);

                if (teller == namen.length) {
                    show = true;
                    repaint();
                }
            }
        }
    }
}


package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Praktijkopdracht extends Applet {

    Button knop1;
    Label label;
    TextField teksveld;
    int tafelGebruikerInvoer;
    int x, y;
    String tekst;

    public void init() {

        label = new Label("Voer een getal van 1 tot 10 in");
        teksveld = new TextField("Type hier", 30);
        knop1 = new Button("OK");
        knop1.addActionListener(new Knop1Functie());

        add(label);
        add(teksveld);
        add(knop1);

        x = 100;
        y = 100;

    }

    public void paint(Graphics g) {

        if (tafelGebruikerInvoer == 0) {
            g.drawString("", x, y);

        } else {
            for (int i = 1; i < 11; i++) {

                int tafeluitkomst = i * tafelGebruikerInvoer;

                g.drawString(i + " x " + tafelGebruikerInvoer + " = " + tafeluitkomst, x, y);

                y += 20;
            }
            y = 100;
        }
    }

    class Knop1Functie implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            tekst = teksveld.getText();
            tafelGebruikerInvoer = Integer.parseInt(tekst);
            repaint();
        }
    }
}







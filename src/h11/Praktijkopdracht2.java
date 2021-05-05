package h11;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Praktijkopdracht2 extends Applet {

    Button knop1;
    Label labelTekst;
    int tafel;
    boolean button1IsGeklikt;

    public void init() {

        labelTekst = new Label("Druk op OK knop om de volgende tafel te zien.");
        knop1 = new Button("OK");
        knop1.addActionListener(new Knop1functie());

        tafel = 1;
        button1IsGeklikt = false;

        add(labelTekst);
        add(knop1);

    }

    public void paint(Graphics g) {

        if (button1IsGeklikt = true) {

            int y = 100;

            for (int i = 1; i < 11; i++) {

                int tafelUitkomst = i * tafel;

                g.drawString(i + " x " + tafel + " = " + tafelUitkomst, 200, y);

                y += 20;
            }
            tafel ++;
        }
    }


    class Knop1functie implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (button1IsGeklikt = true) {
                repaint();
            }
        }
    }
}



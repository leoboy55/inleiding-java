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

        tafel = 0;
        button1IsGeklikt = true;

        add(labelTekst);
        add(knop1);

    }

    public void paint(Graphics g) {
        setTafel(g);
    }


    public void setTafel(Graphics g) {
        int y = 100;
        tafel++;
        for (int i = 1; i < 11; i++) {
            int tafelUitkomst = i * tafel;
            String x = i + " x " + tafel + " = " + tafelUitkomst;
            g.drawString(x, 200, y);
            y += 20;
        }
    }


    class Knop1functie implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}

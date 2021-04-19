package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8_3 extends Applet {

    Button OK;
    Label label;
    TextField tekstVeld;
    String Print,Print2;
    double BTW, Getal;

    public void init() {
        //BTW Formule
        BTW = 1.21;

        //OK BTW Knop
        OK = new Button("OK");
        OK.addActionListener(new TekstKnop());
        add(OK);
        Print2 = "";

        //Tekst Veld
        tekstVeld = new TextField("Type gewenst bedrag");
        label = new Label("");
        tekstVeld.addActionListener(new TekstVeld());
        add(tekstVeld);
        add(label);
        Print = "";
    }

    public void paint (Graphics g) {
        //Background Collor
        setBackground(Color.lightGray);

        //Main Frame
        g.drawRect(550,100,800,100);
        g.drawLine(550,99,1350,99);
        g.drawLine(549,100,549,200);
        g.setColor(Color.orange);
        g.fillRect(550,100,800,100);

        //Button OK
        OK.setLocation(1000,100);
        OK.setSize(350,100);

        //TekstVeld
        tekstVeld.setLocation(550,100);
        tekstVeld.setSize(450,25);

        //Label
        label.setLocation(550,150);
        label.setSize(450,30);
        g.setColor(Color.black);
        g.drawString("" + Getal,600,170);

        //Uitleg functie
        g.setColor(Color.BLACK);
        g.drawRect(550,60,800,39);
        g.setColor(Color.orange);
        g.fillRect(550,60,800,39);
        g.setColor(Color.black);
        g.drawString("Type het gewenste bedrag onder in, druk dan op de OK knop of druk ENTER om het gewenste bedrag met BTW te zien",620,85);
    }

    class TekstVeld implements ActionListener {
        public void actionPerformed (ActionEvent e){
            Print = tekstVeld.getText();
            Getal = Double.parseDouble(Print);
            label.setText("" +(Getal * BTW) + " " + "Euro");
            repaint();
        }
    }
    class TekstKnop implements ActionListener {
        public void actionPerformed (ActionEvent e){
            Print2 = tekstVeld.getText();
            Getal = Double.parseDouble(Print2);
            label.setText("" +(Getal * BTW) + " " + "Euro");
            repaint();
        }
    }

}

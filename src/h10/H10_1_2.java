package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_1_2 extends Applet {

    TextField tekst;
    Label label, label2;
    int UitkomstNieuw, UitkomstOud, UitkomstNieuwlaagste, UitkomstOudlaagste, superWaarde;
    String uitkomstNIeuwHoogste, uitkomstOudHoogste, UitkomstNieuwLaagste, UitkomstOudLaagste, UitlegHoogste, UitlegLaagste;

    public void init() {
        // Uitleg Hoogste en laagste
        UitlegHoogste = "Dit is het hoogste getal:";
        UitlegLaagste = "Dit is het laagste getal:";

        //Tekstveld
        tekst = new TextField("");
        tekst.addActionListener(new HoogsteGetal());
        add(tekst);
        uitkomstNIeuwHoogste = "";

        //Label
        uitkomstOudHoogste = "";
        label = new Label(uitkomstOudHoogste);
        add(label);

        //label + laagste getal strings
        superWaarde = 99999999;
        UitkomstNieuwLaagste = "";
        UitkomstOudLaagste = "";
        label2 = new Label(UitkomstOudLaagste);
        add(label2);
    }

    public void paint(Graphics g) {

        //background
        setBackground(Color.pink);

        //Frame
        g.setColor(Color.black);
        g.drawRect(700, 150, 500, 500);
        g.setColor(Color.lightGray);
        g.fillRect(701, 151, 499, 499);

        //Tekstvak
        tekst.setText("Voer een getal in");
        tekst.setLocation(800, 200);
        tekst.setSize(300, 30);

        //Tekstlabel
        label.setLocation(800, 250);
        label.setSize(300, 50);
        label.setBackground(Color.orange);
        label.setText("" + UitkomstOud );

        //Uitleg Hoogste getal
        g.setColor(Color.black);
        g.drawString(UitlegHoogste, 800, 245);

        //Tekstlabel2
        label2.setLocation(800, 320);
        label2.setSize(300, 50);
        label2.setBackground(Color.orange);
        label2.setText("" + superWaarde);

        //Uitleg Laagste getal
        g.setColor(Color.black);
        g.drawString(UitlegLaagste, 800, 315);

    }

    class HoogsteGetal implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            uitkomstNIeuwHoogste = tekst.getText();
            UitkomstNieuwLaagste = tekst.getText();

            uitkomstOudHoogste = label.getText();
            UitkomstOudLaagste = label2.getText();

            UitkomstNieuw = Integer.parseInt(uitkomstNIeuwHoogste);
            UitkomstOud = Integer.parseInt(uitkomstOudHoogste);
            UitkomstNieuwlaagste = Integer.parseInt(UitkomstNieuwLaagste);
            UitkomstOudlaagste = Integer.parseInt(UitkomstOudLaagste);

            if ( UitkomstNieuw > UitkomstOud) {
                label.setText("" + UitkomstNieuw);

            }
            if (UitkomstNieuwlaagste <  UitkomstOudlaagste )
                label2.setText("" + UitkomstNieuwlaagste);
                System.out.println(UitkomstNieuwlaagste);
            }
        }
        }








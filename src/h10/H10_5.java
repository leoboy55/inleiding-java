package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_5 extends Applet {

    TextField tekstveld;
    Label label;
    double CijverinvoerDouble, totaal, totaalPlus, totaalClick;
    String gemiddeldeCijfer, Cijfer, getCijfer;
    Button GemiddeldeKnop;


    public void init(){

        tekstveld = new TextField("Voer hier je cijver in.",60);
        label = new Label("Voer je cijvers in om te zien of je geslaagd bent.");
        tekstveld.addActionListener(new CijferInvoer ());
        Cijfer = "";
        add(label);
        add(tekstveld);
        GemiddeldeKnop = new Button("Druk hier voor het gemiddelde cijfer.");
        GemiddeldeKnop.addActionListener(new GemiddeldeCijver());
        gemiddeldeCijfer = "";
        add(GemiddeldeKnop);

    }

    public void paint(Graphics g) {

        g.drawString( "" + Cijfer, 775,60);
        g.drawString("" + gemiddeldeCijfer, 775,80);

    }

    class CijferInvoer implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            getCijfer = tekstveld.getText();
            CijverinvoerDouble = Double.parseDouble(getCijfer);

            if (CijverinvoerDouble >= 5.5){

                Cijfer = getCijfer + " " + " is een voldoende.";
            }

            else {
                Cijfer = getCijfer + " " + " Is een onvoldoende.";

            }
            repaint();
        }
    }

    class GemiddeldeCijver implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            totaalPlus += (CijverinvoerDouble++);
            CijverinvoerDouble /= (totaalClick++);
            totaal = (totaalPlus / totaalClick);

            System.out.println(totaalClick);
            System.out.println(totaalPlus);
            System.out.println(totaal);


            if (totaal >= 5.5){
                gemiddeldeCijfer = totaal + " " + " gemmidelde is een voldoede.";
            }
            else{
                gemiddeldeCijfer = totaal + " " + "gemmidelde is een onvoldoende.";
            }
            repaint();
        }
    }
}


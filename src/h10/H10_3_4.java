package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10_3_4 extends Applet {

    int maand, jaartal;
    TextField tekstveldMaand, tekstveldjaar;
    Label label;
    String TekstMaand, TekstJaar, getTekstMaand, getTekstJaar;


    public void init() {

        //tekstveld
        tekstveldMaand = new TextField("Voer daarna de maand nummer in.", 40);
        label = new Label( "Kom er achter hoeveel dagen de maand heeft.");
        tekstveldjaar = new TextField("Voer eerst het jaar in.", 40);
        tekstveldMaand.addActionListener(new TekstvakListener());
        tekstveldjaar.addActionListener(new TekstvakListener());
        TekstMaand = "";
        TekstJaar = "";

        add(label);
        add(tekstveldjaar);
        add(tekstveldMaand);


    }

    public void paint(Graphics g) {

        g.drawString(TekstJaar, 750, 60);
        g.drawString(TekstMaand, 750,80);
    }

    class TekstvakListener implements ActionListener {

        public void actionPerformed(ActionEvent e){

                getTekstJaar = tekstveldjaar.getText();
                jaartal = Integer.parseInt(getTekstJaar);
                getTekstMaand = tekstveldMaand.getText();
                maand = Integer.parseInt(getTekstMaand);

                switch (maand) {

                    case 1:

                        TekstMaand = jaartal + "Januari heeft 31 dagen.";
                        break;

                    case 2:

                        TekstMaand = jaartal + "";

                        if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0) {
                        TekstMaand = "Februari " + jaartal + " Heeft 29 dagen.";
                        } else {
                        TekstMaand = "Februari " + jaartal + " heeft 28 dagen.";}

                        break;

                    case 3:

                        TekstMaand = jaartal + "Maart heeft 31 dagen.";
                        break;

                    case 4:

                        TekstMaand = jaartal + "April heeft 30 dagen.";
                        break;

                    case 5:

                        TekstMaand = jaartal + "Mei heeft 31 dagen.";
                        break;

                    case 6:

                        TekstMaand = jaartal + "Juni heeft 30 dagen.";
                        break;

                    case 7:

                        TekstMaand = jaartal + "Juli heeft 31 dagen.";
                        break;

                    case 8:

                        TekstMaand = jaartal + "Augustus heeft 31 dagen.";
                        break;

                    case 9:

                        TekstMaand = jaartal + "September heeft 30 dagen.";
                        break;

                    case 10:

                        TekstMaand = jaartal + "Oktober heeft 31 dagen.";
                        break;

                    case 11:

                        TekstMaand = jaartal +"November heeft 30 dagen.";
                        break;

                    case 12:

                        TekstMaand = jaartal + "December heeft 31 dagen.";

                    default:

                        TekstMaand = "voer een getal in van 1 tot en met 12.";
                        break;

                }
                repaint();
            }
        }
    }




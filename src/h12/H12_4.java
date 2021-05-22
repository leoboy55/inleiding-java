package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_4 extends Applet {

    int[] getallen = new int[51];
    int getalWaarde;
    int getCijfer;
    Button knop;
    Label label;
    TextField tekstvak;

    public void init() {

        tekstvak = new TextField("Voer een getal in.");
        knop = new Button("OK");
        label = new Label("");

        add(tekstvak);
        add(knop);
        knop.addActionListener(new KnopFunctie());
        add(label);

        for (int i = 0; i < getallen.length; i++) {

            getalWaarde = i * 2;
            System.out.println(getalWaarde);

            if(getalWaarde % 2 == 0) {
                System.out.println("getalgevonden " + getallen[0]);
                getallen[i] = getalWaarde;
            } else {
                System.out.println("getal niet gevonden.");
            }

        }


    }

    public void paint(Graphics g) {

        label.setLocation(50, 50);
        label.setSize(400, 100);

    }

    class KnopFunctie implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String tekstgebruiker = tekstvak.getText();
            getCijfer = Integer.parseInt(tekstgebruiker);

            for (int i = 0; i < getallen.length; i++) {

                getalWaarde = i * 2;
                System.out.println(getallen[i]);


                if(getallen[i] == getCijfer){
                    label.setText("Getal gevonden " + "INDEX = " + i);

                    break;

            } else {
                label.setText("Getal niet gevonden");

                }
            }
        }
    }
}






package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class H12_5 extends Applet {


    int[] afgerondeCijfers = {1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 9, 10};
    TextField tekstveld;
    Label label;
    Label label2;

    public void init() {
        tekstveld = new TextField("Type hier", 30);
        tekstveld.addActionListener(new TekstveldFunctie());
        label = new Label("wat zijn de eind cijvers die gehaald zijn");
        label2 = new Label("");

        add(label);
        add(tekstveld);
        add(label2);
    }

    public void paint(Graphics g) {
        label2.setLocation(75, 75);
        label2.setSize(400, 30);
    }

    class TekstveldFunctie implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int teller = 0;
            String tekst = tekstveld.getText();
            int gebruikerGetal = Integer.parseInt(tekst);

            for (int i = 0; i < afgerondeCijfers.length; i++) {
                if (afgerondeCijfers[i] == gebruikerGetal){
                    teller++;
                }
            }
            if (teller > 0) {
                label2.setText("Ingevoerde Cijfer " + gebruikerGetal + " komt " + teller + " keer voor`.");
            }
            repaint();
        }
    }
}


















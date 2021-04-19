package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8_1 extends Applet {
    Button okKnop, resetKnop;
    Label label;
    TextField tekstvak;

    public void init() {
        //Knop1
        okKnop = new Button("OK");
        okKnopListener kl = new okKnopListener();
        okKnop.addActionListener(kl);
        add(okKnop);

        //Knop2
        resetKnop = new Button("RESET");
        resetKnopListener a = new resetKnopListener();
        resetKnop.addActionListener(a);
        add(resetKnop);

        //Tekstvak
        tekstvak = new TextField("Type Hier");
        label = new Label("");
        add(tekstvak);
        add(label);

    }

    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String S = tekstvak.getText();
            label.setText(S);
            label.setSize (500,20);


        }
    }

    class resetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("");

        }
    }
}





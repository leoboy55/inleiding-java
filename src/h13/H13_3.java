package h13;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class H13_3 extends Applet {

    Button grijzeKnop, rodeKnop;
    boolean grijs, rood;

    public void init() {

        grijzeKnop = new Button("Bettonenmuur");
        grijzeKnop.addActionListener(new GrijzeKnopFunctie());
        rodeKnop = new Button("Baksteenmuur");
        rodeKnop.addActionListener(new RodeKnopFunctie());

        add(grijzeKnop);
        add(rodeKnop);

    }

    public void paint(Graphics g) {
        if(grijs) {

            int y1 = 60;

            for (int i = 0; i < 10 ; i++) {

                grijzeBettonBlokken(getGraphics(), 60, y1, 120, 60);
                y1 += 62;
                grijs = false;
            }

        }
        if(rood) {

            int y1 = 40;

            for (int i = 0; i < 10; i++) {

                rodeBakstenen(getGraphics(),40,y1,60,40);
                y1 += 42;
                rood = false;
            }
        }
    }

    class GrijzeKnopFunctie implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            grijs = true;
            rodeBakstenen(getGraphics(),0,0,0,0);
            repaint();
            }
        }

        class RodeKnopFunctie implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                rood = true;
                grijzeBettonBlokken(getGraphics(), 0, 0, 0, 0);
                repaint();
            }
        }

    public static void grijzeBettonBlokken(Graphics g, int x1, int y1, int x2, int y2) {

        for (int i = 0; i < 10 ; i++) {

            g.setColor(Color.gray);
            g.fillRect(x1,y1,x2,y2);
            x1 += 122;

        }
    }

    public static void rodeBakstenen(Graphics g, int x1, int y1, int x2, int y2) {

        for (int i = 0; i < 10 ; i++) {

            g.setColor(Color.red);
            g.fillRect(x1,y1,x2,y2);
            x1 += 62;

        }
    }
}

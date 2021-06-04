package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14 extends Applet{

    int randomGetal, randomGetal2;
    String randomKaartdelen;
    String[] StringKaartenType = {"Ruiten" , "klaver" , "Schoppen" , "Harten"};
    String[] KaartWaardes = {"aas" , "twee" , "Drie" , "vier" , "vijf" , "zes" , "zeven" , "acht" , "megen" , "tien" , "boer" , "dame" , "heer" };
    Button deelKaart;

    public void init() {

        randomKaartdelen = "";

        deelKaart = new Button("Deel Kaart");
        deelKaart.addActionListener(new KnopFunctie());
        add(deelKaart);

    }

    public void paint(Graphics g) {

        g.drawString(randomKaartdelen,60,100);

    }
    class KnopFunctie implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            randomGetal = (int) (Math.random()*StringKaartenType.length);
            randomGetal2 = (int) (Math.random()*KaartWaardes.length);

            randomKaartdelen = StringKaartenType[randomGetal] + " " + KaartWaardes[randomGetal2];

            repaint();
            randomGetal = 0;
            randomGetal2 = 0;
        }
    }
}



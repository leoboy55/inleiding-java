package h14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class H14_2 extends Applet {

    Button buttonKaarten;
    boolean kaartDelenActief;
    String[] deck = new String[52];
    String[] player1 = new String[13];
    String[] player2 = new String[13];
    String[] player3 = new String[13];
    String[] player4 = new String[13];

    private AudioClip sound;

    public void init() {

        //Klaver speelkaarten
        deck[0] = "Klaver " + "aas ";
        deck[1] = "Klaver " + "twee ";
        deck[2] = "Klaver " + "drie ";
        deck[3] = "Klaver " + "vier ";
        deck[4] = "Klaver " + "vijf ";
        deck[5] = "Klaver " + "zes ";
        deck[6] = "Klaver " + "zeven ";
        deck[7] = "Klaver " + "acht ";
        deck[8] = "Klaver " + "negen ";
        deck[9] = "Klaver " + "tien ";
        deck[10] = "Klaver " + "boer ";
        deck[11] = "Klaver " + "dame ";
        deck[12] = "Klaver " + "heer ";

        //Schoppen speelkaarten
        deck[13] = "Schoppen " + "aas ";
        deck[14] = "Schoppen " + "twee ";
        deck[15] = "Schoppen " + "drie ";
        deck[16] = "Schoppen " + "vier ";
        deck[17] = "Schoppen " + "vijf ";
        deck[18] = "Schoppen " + "zes ";
        deck[19] = "Schoppen " + "zeven ";
        deck[20] = "Schoppen " + "acht ";
        deck[21] = "Schoppen " + "negen ";
        deck[22] = "Schoppen " + "tien ";
        deck[23] = "Schoppen " + "boer ";
        deck[24] = "Schoppen " + "dame ";
        deck[25] = "Schoppen " + "heer ";

        //Harten speelkaarten
        deck[26] = "Harten " + "aas ";
        deck[27] = "Harten " + "twee ";
        deck[28] = "Harten " + "drie ";
        deck[29] = "Harten " + "vier ";
        deck[30] = "Harten " + "vijf ";
        deck[31] = "Harten " + "zes ";
        deck[32] = "Harten " + "zeven ";
        deck[33] = "harten " + "acht ";
        deck[34] = "Harten " + "negen ";
        deck[35] = "Harten " + "tien ";
        deck[36] = "Harten " + "boer ";
        deck[37] = "Harten " + "dame ";
        deck[38] = "Harten " + "heer ";

        //Ruiten speelkaarten
        deck[39] = "Ruiten " + "aas ";
        deck[40] = "Ruiten " + "twee ";
        deck[41] = "Ruiten " + "drie ";
        deck[42] = "Ruiten " + "vier ";
        deck[43] = "Ruiten " + "vijf ";
        deck[44] = "Ruiten " + "zes ";
        deck[45] = "Ruiten " + "zeven ";
        deck[46] = "Ruiten " + "acht ";
        deck[47] = "Ruiten " + "negen ";
        deck[48] = "Ruiten " + "tien ";
        deck[49] = "Ruiten " + "boer ";
        deck[50] = "Ruiten " + "dame ";
        deck[51] = "Ruiten " + "heer ";

        URL pad = H14_2.class.getResource("applaus.wav");
        sound = getAudioClip(pad, "applaus.wav");
        buttonKaarten = new Button("Deel Kaarten");
        buttonKaarten.addActionListener(new DeelkaartenFunctie());
        add(buttonKaarten);
    }

    public void paint(Graphics g) {

        int y = 100;

        g.drawString("Speler1", 30, 70);
        g.drawString("Speler2", 200, 70);
        g.drawString("Speler3", 380, 70);
        g.drawString("Speler4", 560, 70);

        if (kaartDelenActief) {

            for (int i = 0; i < player1.length; i++) {
                g.drawString("" + player1[i], 20, y);
                g.drawString("" + player2[i], 200, y);
                g.drawString("" + player3[i], 380, y);
                g.drawString("" + player4[i], 560, y);
                y += 10;
            }
        }
    }
    class DeelkaartenFunctie implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            kaartDelenActief = true;

                for (int i = 0; i < player1.length; i++) {
                    player1[i] = deelKaart();
                    player2[i] = deelKaart();
                    player3[i] = deelKaart();
                    player4[i] = deelKaart();
                }
                repaint();
                sound.play();
            }
        }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];

        String[] hulpLijst = new String[deck.length - 1];

        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }
}




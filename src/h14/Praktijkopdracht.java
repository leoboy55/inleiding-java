package h14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class Praktijkopdracht extends Applet {

    Label label;
    TextField tekstvak;
    Button playButton;
    int totaleSmilleys;
    int teller;
    private Image[] afbeelding = new Image[23];

    public void init() {

        label = new Label("Hoeveel smileys neem je (één ,twee of drie) ?");
        tekstvak = new TextField("", 30);
        playButton = new Button("Speel");
        playButton.addActionListener(new gameStartenKnop());
        totaleSmilleys = 23;

        URL pad = Praktijkopdracht.class.getResource("");

        for (int i = 0; i < afbeelding.length; i++) {
            afbeelding[i] = getImage(pad, "weed-afbeelding.png");
        }
        add(label);
        add(tekstvak);
        add(playButton);
    }

    public void paint(Graphics g) {

        if (totaleSmilleys > 0)
            g.drawString("Aantal Weed: " + totaleSmilleys + " Jouw beurt.", 200, 100);

        else {
            g.drawString("je hebt verloren ", 200, 100);
        }

        int x = 20;
        int y = 120;

        for (teller = 0; teller < totaleSmilleys; teller++) {
            g.drawImage(afbeelding[teller], x, y, 50, 50, this);
            x += 50;
        }
    }

    class gameStartenKnop implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String gebruikerInput = tekstvak.getText();
            int gebruikersIntegerInput = Integer.parseInt(gebruikerInput);

            if (gebruikersIntegerInput < 4){
                totaleSmilleys = totaleSmilleys - gebruikersIntegerInput;
            } else {
                label.setText("Verkeerde invoer, alleen 3,2,1 geldig.");
            }
            getTotaleWeed();
            repaint();
        }
    }

    public void getTotaleWeed() {

        Random r = new Random();
        int cpuOut = r.nextInt(3)+1;
        int restwaarde = totaleSmilleys % 4;

        if(restwaarde > 1) {
            cpuOut = restwaarde - 1;
        }
        totaleSmilleys -= cpuOut;
    }
}


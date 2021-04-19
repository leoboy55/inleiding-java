package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H8_2 extends Applet {

    Button totaalPotencieelknop, totaalknop, mannenKnop, vrouweKnop;
    TextField mannenTekst,vrouwenTekst,totaalPotentcieelTekst, totaalTekst;
    int mannenAantalCounter,vrouwenAantalCounter,totaalPontentieelCounter,TotaalCounter;

    public void init() {

        setBackground(Color.pink);

        //Mannen
        mannenAantalCounter = 0;
        mannenKnop = new Button("mannen");
        mannenTekst = new TextField("");
        totaalMannenKnop c = new totaalMannenKnop();
        mannenKnop.addActionListener(c);
        add(mannenTekst);
        add(mannenKnop);

        //Vrouwen
        vrouwenAantalCounter = 0;
        vrouweKnop = new Button("vrouwen");
        vrouwenTekst = new TextField("");
        totaalVrouwenKnop b = new totaalVrouwenKnop();
        vrouweKnop.addActionListener(b);
        add(vrouwenTekst);
        add(vrouweKnop);

        //Potentiele Bezoekers
        totaalPontentieelCounter = 0;
        totaalPotencieelknop = new Button("potentiële Bezoekers");
        totaalPotentcieelTekst = new TextField("");
        totaalPotencieelknop a = new totaalPotencieelknop();
        totaalPotencieelknop.addActionListener(a);
        add(totaalPotentcieelTekst);
        add(totaalPotencieelknop);

        //Totaal
        TotaalCounter = 0;
        totaalknop = new Button("Druk hier voor Totaal");
        totaalTekst = new TextField("");
        add(totaalTekst);
        add(totaalknop);

       totaalknop.addActionListener(new TextListener());
    }
        public void paint (Graphics g){

            //Frame Applet
            g.drawRect(20,20,1400,100);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(20,20,1400,100);

            //MannenButton Properties
            mannenKnop.setLocation(20,20);
            mannenKnop.setSize(300,40);
            mannenTekst.setLocation(20,60);
            mannenTekst.setSize(300,30);


            //VrouwenButton Properties
            vrouweKnop.setLocation(320,20);
            vrouweKnop.setSize(300,40);
            vrouwenTekst.setLocation(320,60);
            vrouwenTekst.setSize(300,30);

            //Potentiele Properties
            totaalPotencieelknop.setLocation(620,20);
            totaalPotencieelknop.setSize(300,40);
            totaalPotentcieelTekst.setLocation(620,60);
            totaalPotentcieelTekst.setSize(300,30);

            //Totaal Properties
            totaalknop.setBackground(Color.green);
            totaalknop.setLocation(920,20);
            totaalknop.setSize(500,40);
            totaalTekst.setLocation(920,60);
            totaalTekst.setSize(500,30);
        }
    class totaalMannenKnop implements ActionListener {

        public void actionPerformed (ActionEvent e){
            //MannenCounter Counter
            mannenAantalCounter++;
            mannenTekst.setText("" + mannenAantalCounter);
        }
    }
    class totaalVrouwenKnop implements ActionListener {

        public void actionPerformed (ActionEvent e){
            //Vrouwen Counter
            vrouwenAantalCounter++;
            vrouwenTekst.setText("" + vrouwenAantalCounter);
        }
    }

        class totaalPotencieelknop implements ActionListener {

            public void actionPerformed (ActionEvent e){
                //Potentieel Counter
                totaalPontentieelCounter++;
                totaalPotentcieelTekst.setText("" + totaalPontentieelCounter);
            }
        }
    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //Totaal Counter//

            totaalTekst.setText("" + (mannenAantalCounter + vrouwenAantalCounter + totaalPontentieelCounter) );
        }
    }
    }
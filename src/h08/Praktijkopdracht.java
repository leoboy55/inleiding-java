package h08;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    Button plusButton, minButton, KeerButton, GedeeldButton;
    TextField uitkomstvak1, vak2;
    double uitkomstVak1,uitkomstVak2,UitkomstTotaal;
    String Vak1, Vak2, Font1;

    public void init() {
        //Textfield 1
        uitkomstvak1 = new TextField("");
        add(uitkomstvak1);
        Vak1 = "";

        //Textfield 2

        vak2 = new TextField("");
        add(vak2);
        Vak2 = "";

        //Lettertype
        Font1 = "+";
        setFont(new Font("" + Font1, 20, 40));

        //+knop
        plusButton = new Button(Font1);
        plusButton.addActionListener(new ButtonFunctionPlus());
        add(plusButton);


        //-Knop
        minButton = new Button("-");
        minButton.addActionListener(new ButtonFunctionMin());
        add(minButton);


        //*knop
        KeerButton = new Button("*");
        KeerButton.addActionListener(new ButtonFunctionKeer());
        add(KeerButton);


        //:button
        GedeeldButton = new Button("/");
        GedeeldButton.addActionListener(new ButtonFunctionGedeeld());
        add(GedeeldButton);

    }

    public void paint(Graphics g) {
        //Background Collor
        setBackground(Color.cyan);

        //frame rekenmachine
        g.drawRect(750, 100, 400, 500);
        g.setColor(Color.lightGray);
        g.fillRect(750, 100, 400, 500);
        g.setColor(Color.black);
        g.drawLine(750, 200, 1150, 200);

        //Teskvak1
        uitkomstvak1.setLocation(780, 120);
        uitkomstvak1.setSize(160, 60);

        //Tekstvak2
        vak2.setLocation(960, 120);
        vak2.setSize(160, 60);

        //+ Button
        plusButton.setLocation(780, 250);
        plusButton.setSize(160, 120);
        g.setColor(Color.black);

        //- Button
        minButton.setLocation(960, 250);
        minButton.setSize(160, 120);

        //* Button
        KeerButton.setLocation(780, 420);
        KeerButton.setSize(160, 120);

        //: Button
        GedeeldButton.setLocation(960, 420);
        GedeeldButton.setSize(160, 120);
    }
    class ButtonFunctionPlus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vak1 = uitkomstvak1.getText();
            Vak2 = vak2.getText();
            uitkomstVak1 = Double.parseDouble(Vak1);
            uitkomstVak2 = Double.parseDouble(Vak2);
            UitkomstTotaal = uitkomstVak1 + uitkomstVak2;
            uitkomstvak1.setText("" + UitkomstTotaal);
            vak2.setText("");
            repaint();
        }
    }
    class ButtonFunctionMin implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vak1 = uitkomstvak1.getText();
            Vak2 = vak2.getText();
            uitkomstVak1 = Double.parseDouble(Vak1);
            uitkomstVak2 = Double.parseDouble(Vak2);
            UitkomstTotaal = uitkomstVak1 - uitkomstVak2;
            uitkomstvak1.setText("" + UitkomstTotaal);
            vak2.setText("");
            repaint();
        }
    }
    class ButtonFunctionKeer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vak1 = uitkomstvak1.getText();
            Vak2 = vak2.getText();
            uitkomstVak1 = Double.parseDouble(Vak1);
            uitkomstVak2 = Double.parseDouble(Vak2);
            UitkomstTotaal = uitkomstVak1 * uitkomstVak2;
            uitkomstvak1.setText("" + UitkomstTotaal);
            vak2.setText("");
            repaint();
        }
    }
    class ButtonFunctionGedeeld implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Vak1 = uitkomstvak1.getText();
            Vak2 = vak2.getText();
            uitkomstVak1 = Double.parseDouble(Vak1);
            uitkomstVak2 = Double.parseDouble(Vak2);
            UitkomstTotaal = uitkomstVak1 / uitkomstVak2;
            uitkomstvak1.setText("" + UitkomstTotaal);
            vak2.setText("");
            repaint();
        }
    }
}


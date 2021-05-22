package h12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class H12_3 extends Applet {

    Button button_Ok;
    TextField[] textField_numbers = new TextField[5];

    public void init() {

        for (int i = 0; i < textField_numbers.length; i++) {

            textField_numbers[i] = new TextField("Type getallen");
            add(textField_numbers[i]);

        }
        button_Ok = new Button("OK");
        button_Ok.addActionListener(new KnopFunctie());
        add(button_Ok);
    }

    public void paint(Graphics g) {

    }

    class KnopFunctie implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //de array die we op een volgorde willen hebben
            int[] textField_numbersSorted = new int[textField_numbers.length];
//            int[] numbers = new int[] { 333,2,3,43,5 };

            // pak de waardes van textField_numbers en zet deze in textField_numbersSorted
            for (int i = 0; i < textField_numbers.length; i++) {
                String text = textField_numbers[i].getText();
                int number = Integer.parseInt(text);
                textField_numbersSorted[i] = number;
            }

            // hier worden de waardes van textField_numbersSorted gesorteerd
            Arrays.sort(textField_numbersSorted);

            //
            for (int i = 0; i < textField_numbers.length; i++) {
                textField_numbers[i].setText("" + i);
//                textField_numbers[i].setText("" + numbers[i]);
            }
        }
    }
}


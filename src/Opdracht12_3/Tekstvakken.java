package Opdracht12_3;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Tekstvakken extends Applet {
    Button knop;
    TextField[] tekstvak;
    int[] totaal;

    public void init() {
        tekstvak = new TextField[5];
        totaal = new int[5];

        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("");
            add(tekstvak[i]);
        }
        //Knop
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        add(knop);
    }

    public void paint(Graphics g) {}

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < tekstvak.length; i++) {
                totaal[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(totaal);

            for (int i = 0; i < totaal.length; i++) {
                tekstvak[i].setText(String.valueOf(totaal[i]));
            }

            repaint();
        }
    }
}



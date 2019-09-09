package Praktijkopdracht;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Telefoonboek extends Applet {
    TextField telefoonNummer;
    TextField naam;
    Button ok;
    int teller;
    String[] telefoonNummers;
    String[] namen;

    public void init() {
        telefoonNummer = new TextField("", 20);
        naam = new TextField("", 20);
        ok = new Button("Ok");

        KnopListener kl = new KnopListener();
        ok.addActionListener(kl);

        add(naam);
        add(telefoonNummer);
        add(ok);

        teller = 0;
        telefoonNummers = new String[10];
        namen = new String[10];
        for (int i = 0; i < telefoonNummers.length; i++) {
            telefoonNummers[i] = "";
            namen[i] = "";
        }
    }

    public void paint(Graphics g) {
        int y = 60;
        if (teller <= 10) {
            for (int i = 0; i < 10; i++) {
                y += 20;
                g.drawString("" + namen[i], 50, y);
                g.drawString("" + telefoonNummers[i], 150, y);
            }
        }
        g.drawString("Namen", 50, 60);
        g.drawString("Telefoonnummers", 150, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            telefoonNummers[teller] = telefoonNummer.getText();
            namen[teller] = naam.getText();
            telefoonNummer.setText("");
            naam.setText("");
            teller = teller + 1;
            repaint();
        }
    }
}
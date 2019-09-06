package Opdracht12_1;

import java.applet.*;
import java.awt.*;

public class Getallen extends Applet {
    double[] salaris;
    double totaal;

    public void init() {
        salaris = new double[10];
        salaris[0] = 23;
        salaris[1] = 76;
        salaris[2] = 54;
        salaris[3] = 44;
        salaris[4] = 22;
        salaris[5] = 69;
        salaris[6] = 3;
        salaris[7] = 99;
        salaris[8] = 17;
        salaris[9] = 50;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            totaal = salaris[teller];
            totaal = (salaris[0] + salaris[1] + salaris[2] + salaris[3] + salaris[4] + salaris[5] + salaris[6] + salaris[7] + salaris[8] + salaris[9]) / 10;
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            g.drawString("Gemiddelde: " + totaal, 50, 220);
        }
    }
}

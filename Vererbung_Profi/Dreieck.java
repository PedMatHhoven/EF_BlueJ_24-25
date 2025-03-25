package Vererbung_Profi;

import java.awt.Polygon;

public class Dreieck extends Form {
    private int hoehe;
    private int breite;

    public Dreieck(int h, int b, int x, int y, String f) {
        super(x,y,f);
        hoehe = h;
        breite = b;
    }

    public void groesseAendern(int neueHoehe, int neueBreite) {
        loeschen();
        hoehe = neueHoehe;
        breite = neueBreite;
        zeichnen();
    }

    public void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            int[] xpoints = { xPosition, xPosition + (breite / 2),
                              xPosition - (breite / 2) };
            int[] ypoints = { yPosition, yPosition + hoehe, yPosition + hoehe };
            leinwand.zeichne(this, farbe, new Polygon(xpoints, ypoints, 3));
            leinwand.warte(10);
        }
    }
}

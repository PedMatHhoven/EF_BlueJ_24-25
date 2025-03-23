package Vererbung;

import java.awt.geom.Ellipse2D;

public class Kreis extends Form {
    private int durchmesser;

    public Kreis(int d, int x, int y, String f) {
        super(x,y,f);
        durchmesser = d;
    }

    public void groesseAendern(int neuerDurchmesser) {
        loeschen();
        durchmesser = neuerDurchmesser;
        zeichnen();
    }

    public void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, farbe, new Ellipse2D.Double(xPosition,
                        yPosition, durchmesser, durchmesser));
                        leinwand.warte(10);
        }
    }
}

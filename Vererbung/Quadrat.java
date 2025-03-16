package Vererbung;

import java.awt.Rectangle;

public class Quadrat extends Form {
    private int groesse;
    
    public Quadrat(int g, int x, int y, String f) {
        super(x,y,f);
        groesse = g;
    }

    public void groesseAendern(int neueGroesse) {
        loeschen();
        groesse = neueGroesse;
        zeichnen();
    }


    public void zeichnen() {
        Leinwand leinwand = Leinwand.gibLeinwand();
        leinwand.zeichne(this, farbe, new Rectangle(xPosition, yPosition,
                         groesse, groesse));
        leinwand.warte(10);
    }
}

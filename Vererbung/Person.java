package Vererbung;

import java.awt.Polygon;

public class Person extends Form {
    private int hoehe;
    private int breite;

    public Person(int h, int b, int x, int y, String f) {
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
        int bh = (int)(hoehe * 0.7);  //
        int hh = (hoehe - bh) / 2;  // 
        int hw = breite / 2;  // halbe Breite
        int x = xPosition;
        int y = yPosition;
        Leinwand leinwand = Leinwand.gibLeinwand();
        int[] xpunkte = { x-3, x-hw, x-hw, x-(int)(hw*0.2)-1, x-(int)(hw*0.2)-1, x-hw, 
                          x-hw+(int)(hw*0.4)+1, x, x+hw-(int)(hw*0.4)-1, x+hw, x+(int)(hw*0.2)+1, 
                          x+(int)(hw*0.2)+1, x+hw, x+hw, x+3, x+(int)(hw*0.6), 
                          x+(int)(hw*0.6), x+3, x-3, x-(int)(hw*0.6), x-(int)(hw*0.6) };
        int[] ypunkte = { y, y+(int)(bh*0.2), y+(int)(bh*0.4), y+(int)(bh*0.2), 
                          y+(int)(bh*0.5), y+bh, y+bh, y+(int)(bh*0.65), y+bh, y+bh, 
                          y+(int)(bh*0.5), y+(int)(bh*0.2), y+(int)(bh*0.4), y+(int)(bh*0.2), 
                          y, y-hh+3, y-hh-3, y-hh-hh, y-hh-hh, y-hh-3, y-hh+3 };
        leinwand.zeichne(this, farbe, new Polygon(xpunkte, ypunkte, 21));
        leinwand.warte(10);
    }
}

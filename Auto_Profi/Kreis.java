package Auto_Profi;
import java.awt.geom.Ellipse2D;

/**
 * Ein Original.Kreis, der manipuliert werden kann und sich selbst auf einer Original.Leinwand
 * zeichnet.
 *
 * @author Michael Kölling und David J. Barnes
 * @version 31.07.2011
 */

public class Kreis {
    private int Durchmesser;
    private int XPosition;
    private int YPosition;
    private String Farbe;
    private boolean istSichtbar;

    /**
     * Erzeuge einen neuen Original.Kreis an einer Standardposition mit einer
     * Standardfarbe.
     */
    public Kreis(int durchmesser, int xPosition, int yPosition, String farbe) {
        Durchmesser = durchmesser;
        XPosition = xPosition;
        YPosition = yPosition;
        Farbe = farbe;
        sichtbarMachen();
    }

    public void setXPosition(int XPosition) {
        this.XPosition = XPosition;
    }

    public void setYPosition(int YPosition) {
        this.YPosition = YPosition;
    }

    /**
     * Mache diesen Original.Kreis sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache diesen Original.Kreis unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege diesen Original.Kreis einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege diesen Original.Kreis horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) {
        loeschen();
        XPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege diesen Original.Kreis vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        YPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege diesen Original.Kreis langsam horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            XPosition += delta;
            zeichnen();
        }
    }

    /**
     * Bewege diesen Original.Kreis langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            YPosition += delta;
            zeichnen();
        }
    }

    /**
     * Ändere den Durchmesser dieses Kreises in 'neuerDurchmesser' (Angabe in
     * Bildschirmpunkten). 'neuerDurchmesser' muss größer gleich Null sein.
     */
    public void groesseAendern(int neuerDurchmesser) {
        loeschen();
        Durchmesser = neuerDurchmesser;
        zeichnen();
    }

    /**
     * Ändere die Farbe dieses Kreises in 'neueFarbe'. Gültige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        Farbe = neueFarbe;
        zeichnen();
    }

    /**
     * Zeichne diesen Original.Kreis mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.zeichne(this, Farbe, new Ellipse2D.Double(XPosition,
                    YPosition, Durchmesser, Durchmesser));
            leinwand.warte(10);
        }
    }

    /**
     * Lösche diesen Original.Kreis vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }

}
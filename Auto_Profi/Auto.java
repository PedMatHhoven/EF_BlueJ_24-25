package Auto_Profi;
//@Autor: Benedikt Heffels
//@Version: Verbesserungen/Vereinfachungen (Profi-Version)
public class Auto {
    private Kreis radV, radH;
    private Rechteck karosserieU, karosserieO;
    private Quadrat fensterV, fensterH;
    
    public Auto () {}

    public void zeichne(){
        // ----------------------------------- Reifen als Kreis --------------------------------------------------------
        radV = new Kreis(25, 55, 115, "schwarz");
        radH = new Kreis(25, 170, 115, "schwarz");
        // ----------------------------------- Karosserie als Rechteck -------------------------------------------------
        karosserieU = new Rechteck(150, 30, 50, 100, "blau");
        karosserieO = new Rechteck(100, 30, 75, 70, "blau");
        // ---------------------------------- Fenster als Quadrat ------------------------------------------------------
        fensterV = new Quadrat(20, 80, 80, "glas");
        fensterH = new Quadrat(20, 125, 80, "glas");
    }
}

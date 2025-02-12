package Gesicht_Profi;

public class Bild {
    private Quadrat Gesicht;
    private Rechteck Mund;
    private Dreieck erstesDreieck;
    private Dreieck zweitesDreieck;
    private Dreieck Nase;
    private Kreis AugeE;
    private Kreis AugeZ;
    private Kreis PupilleE;
    private Kreis PupilleZ;

    public void zeichne() {
        Gesicht = new Quadrat(200, 160, 70, "rot");     
        erstesDreieck = new Dreieck(60, 70, 210, 10, "gruen");    
        zweitesDreieck = new Dreieck(60, 70, 310, 10, "gruen");        
        Nase = new Dreieck(60, 70, 260, 140,"gruen");     
        Mund = new Rechteck(130, 30, 195, 220, "blau");    
        AugeE = new Kreis(50, 185, 100,"gelb");       
        AugeZ = new Kreis(50, 285, 100, "gelb");
        PupilleE = new Kreis(20, 300, 120, "schwarz");   
        PupilleZ = new Kreis(20, 200, 120, "schwarz");
    }
}

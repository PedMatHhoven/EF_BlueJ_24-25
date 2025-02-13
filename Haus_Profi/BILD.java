package Haus_Profi;

public class BILD {
    private Quadrat Erde, Haus, Fenster, Fenster2, Baumkrone;
    private Dreieck Dach;
    private Kreis Sonne, Knauf;
    private Person Paul;
    private Rechteck Tür, Balken1, Balken2, Balken3, Balken4, Stamm;
   
    public void zeichne() {
        Erde = new Quadrat(1000, -40, 240, "gruen", true);
        Sonne = new Kreis(80, 50, -10, "gelb", true);
        Paul = new Person(70, 35, 180, 210, "blau", true);
        
        haus();
        baum();
       
        Paul.langsamHorizontalBewegen(200);
        Paul.langsamHorizontalBewegen(-200);
    }
    
    public void haus() {
        Haus = new Quadrat(120, 310, 120, "rot", true);
        Dach = new Dreieck(80, 170, 370, 40, "schwarz", true);
        Tür = new Rechteck(25, 50, 360, 190, "braun", true);
        Knauf = new Kreis(7, 374, 213, "gelb", true);
        
        Fenster = new Quadrat(30, 320, 135, "weiss", true); 
        Balken1 = new Rechteck(5, 30, 332, 135, "braun", true);
        Balken2 = new Rechteck(30, 5, 320, 147, "braun", true);
        
        Fenster2 = new Quadrat(30, 390, 135, "weiss", true);
        Balken3 = new Rechteck(5, 30, 402, 135, "braun", true);
        Balken4 = new Rechteck(30, 5, 390, 147, "braun", true);
    }
    
    public void baum() {
      Stamm = new Rechteck(20, 80, 110, 180, "braun", true);  
      Baumkrone = new Quadrat(80, 80, 110, "gruen", true);
    }
}

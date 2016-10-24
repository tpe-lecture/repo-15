package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.*;
/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }
    
    /**
     * Main-Methode.
     * 
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();
        ZooTier []tiere =new ZooTier [3];
        
        tiere[0] = new Affe("Charlie");
        tiere[1] = new Gorilla("Buck");
        tiere[2] = new Giraffe("Debbie");
        for(int i = 0;i<tiere.length;i++){
            System.out.println(tiere[i]);
        }
        
        System.out.println("Fütterung...");
        futterstelle.gibFutter(tiere);
        for(int i = 0;i<tiere.length;i++){
            System.out.println(tiere[i]);
        }
        
    }
}

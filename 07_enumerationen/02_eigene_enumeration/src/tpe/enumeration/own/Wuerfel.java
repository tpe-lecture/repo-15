package tpe.enumeration.own;

import java.util.Random;

/**
 * Ein einfacher Würfel.
 */
public class Wuerfel {
    
    /** Zufallszahlengenerator. */
    private final Random rnd = new Random();

    /** Anzahl der Seiten des Würfels. */
   private final WuerfelType numSides;

    /**
     * Einen neuen Würfel anlegen.
     *
     * @param numSides Anzahl der Seiten des Würfels.
     */
    public Wuerfel(WuerfelType numSides) {
       // this.numSides = numSides;
        this.numSides = wuerfelType.getDiceFaces();
    }

    /**
     * Den Würfel werfen.
     *
     * @return Ergebnis des Wurfes.
     */
    public int roll() {
        return rnd.nextInt(numSides) + 1;
        
    }
}

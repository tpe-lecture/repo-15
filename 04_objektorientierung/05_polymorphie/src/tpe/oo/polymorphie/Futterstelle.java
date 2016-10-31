package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.*;
/**
 * Fütterung der Tiere.
 */
public class Futterstelle {
    /**
     * fuettert alle ZooTiere die in einem Array uebergeben werden
     * @param tiere ist ein array mit ZooTieren
     */
    public void gibFutter(ZooTier[] tiere)
    {
            for(int i = 0; i < tiere.length; i++){
               gibFutter(tiere[i]);
            }
        }
    public void gibFutter(ZooTier tier) {
        tier.fuettern();
    }
}

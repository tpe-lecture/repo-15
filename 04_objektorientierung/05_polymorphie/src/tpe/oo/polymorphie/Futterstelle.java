package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.*;
/**
 * Fütterung der Tiere.
 */
    public class Futterstelle {
        public void gibFutter(ZooTier [] tiere){
            for(int i=0;i<tiere.length;i++){
               gibFutter(tiere[i]);
            }
        }
    public void gibFutter(ZooTier tier) {
        tier.fuettern();
    }
    /**
     * Füttert den Affen.
     * 
     * @param affe Affe, der gefüttert werden soll. 
     */
   
}

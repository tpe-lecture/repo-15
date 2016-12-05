package tpe.collections.iterate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Anzahl der Münzen. */
    private static final int NUM_COINS = 1000;
    List<Sprite> list1 = new ArrayList<Sprite>();
    /** Münzgenerator. */
    private CoinGenerator generator;

    /**
     * Erzeugt ein neues Board.
     */
    
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(600, 600), Color.BLACK);

        generator = new CoinGenerator(this, NUM_COINS);

        // TODO: Münzen generieren
       Iterator<Sprite> iterSprite =generator.iterator();
       
       for(Sprite x:generator){
           list1.add(x);
       }
//       while(iterSprite.hasNext()){
//           list1.add(iterSprite.next());
//       }
    }


    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public synchronized void drawGame(Graphics g) {
        // TODO: Münzen zeichnen
        Iterator<Sprite> x = list1.iterator();
//        while(x.hasNext()){
//            x.next().draw(g);
//        }
        for(Sprite y:list1){
           y.draw(g);
        }
    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        return true;
    }
}

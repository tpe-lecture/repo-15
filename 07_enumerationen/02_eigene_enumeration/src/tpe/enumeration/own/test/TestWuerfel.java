package tpe.enumeration.own.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tpe.enumeration.own.Wuerfel;
import tpe.enumeration.own.WuerfelType;

/**
 * Test für die Würfel.
 */
public class TestWuerfel {

    /** Anzahl der Durchläufe (Gesetz der großen Zahl!). */
    private static final int RUNS = 10000000;

    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairnessD4() {
        internalTestFairness(new Wuerfel (WuerfelType.D4));
    }

    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairnessD6() {
        internalTestFairness(new Wuerfel(WuerfelType.D6));
    }

    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairnessD8() {
        internalTestFairness(new Wuerfel(WuerfelType.D8));
    }

    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairnessD10() {
        internalTestFairness(new Wuerfel(WuerfelType.D10));
    }
    
    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairnessD12() {
        internalTestFairness(new Wuerfel(WuerfelType.D12));
    }

    /**
     * Interne Hilfsmethode, um die Fairness zu testen.
     *
     * @param w der zu testende Wuerfel.
     * @param expected Erwartungswert.
     */
    private void internalTestFairness(Wuerfel w, double expected) {

        long sum = 0;

        for (int i = 0; i < RUNS; i++) {
            sum += w.roll();
        }

        double average = (double) sum / (double) RUNS;

        assertEquals(expected, average, 0.1);
    }
}

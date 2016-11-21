package MetropolisTPE;

public class Buerger extends Mensch {
    public Buerger(String name, int einkommen, int alter) {
        super(name, einkommen, alter);
    }

    protected int einkommenssteuer() { // not implemented
        return 0;
    }

}

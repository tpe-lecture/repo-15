package MetropolisTPE;
public class Personengesellschaft extends Unternehmen{
    protected Buerger[] inhaber;

    public Personengesellschaft(int gewinn, String name) {
        super(gewinn, name);

    }

    public int gewerbesteuer() { // not implemented
        return 0;
    }

    public int einkommenssteuer() {// not implememnted
        return 0;
    }

}

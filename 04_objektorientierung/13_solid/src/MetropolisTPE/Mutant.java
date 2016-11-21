package MetropolisTPE;
public abstract class Mutant extends Einwohner{
protected String mutation;
    public Mutant(String name, int einkommen,String mutation) {
        super(name, einkommen);
        this.mutation = mutation;
    }


}

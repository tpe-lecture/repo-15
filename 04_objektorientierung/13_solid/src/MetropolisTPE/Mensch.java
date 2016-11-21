package MetropolisTPE;
public abstract class Mensch extends Einwohner{
    protected int alter;

    public Mensch(String name, int einkommen, int alter) {
        super(name, einkommen);
        this.alter = alter;
    }

}

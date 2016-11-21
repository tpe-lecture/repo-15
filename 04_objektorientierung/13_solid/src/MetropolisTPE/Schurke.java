package MetropolisTPE;
public class Schurke extends Mutant implements Einkommensteuerpflichtig{
	
    protected Superkraft schwaeche;

    public Schurke(String name, int einkommen, String mutation) {
        super(name, einkommen, mutation);

    }

    public boolean kaempfe(Superheld held) {// not implememnted
        return true;
    }

    @Override
    public int steuer() {// not implemented
        return 0;
    }

    @Override
    public int einkommensteuer() {
    	int einkommen = this.einkommen;
    	int einkommenssteuer = 0;
    	
    	if (einkommen > 120000) {
			int tempUE120 = einkommen - 120000;
			einkommenssteuer += tempUE120 * 0.4;
			einkommen-= tempUE120;
			System.out.println(einkommenssteuer);
		}if (einkommen >60000) {
			int tempUE60 = einkommen - 60000;
			einkommenssteuer += tempUE60 * Einkommensteuerpflichtig.STEUERSATZ3;
			einkommen -= tempUE60;
			System.out.println(einkommenssteuer);
		}if (einkommen >40000) {
			int tempUE20 = einkommen - 20000;
			einkommenssteuer += tempUE20 * Einkommensteuerpflichtig.STEUERSATZ2;
			einkommen -=tempUE20;
			System.out.println(einkommenssteuer);
		}if (einkommen >0) {
			int tempUE0 = einkommen;
			einkommenssteuer += tempUE0 * Einkommensteuerpflichtig.STEUERSATZ1;
			einkommen -= tempUE0;
			System.out.println(einkommenssteuer);
		}
        return einkommenssteuer;
    }

}

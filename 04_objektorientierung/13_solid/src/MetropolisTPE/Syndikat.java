package MetropolisTPE;
public class Syndikat implements Koerperschaftssteuerpflichtig {
	
protected String namen;
protected Schurke[]schurken;


	public Syndikat(String name,Schurke ...schurken){
		this.schurken = schurken;
		this.namen = name;

	}




public int koerperschaftssteuer(){
	int summe =0;
	for (int i = 0; i < schurken.length; i++) {
		summe +=  (int)(schurken[i].einkommen * Koerperschaftssteuerpflichtig.STEUERSATZ);
	}
 return summe;
}
@Override
public int steuer() {//not implemented

    return 0;
}
}

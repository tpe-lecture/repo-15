package MetropolisTPE;
public class Metropolis {
    private static final Metropolis metropolis = new Metropolis();
    private Einwohner[]einwohner=new Einwohner[100];

    private Metropolis() {

    }

    public Metropolis getMetropolis() {
        return this.metropolis;

    }
    
    
    public static void main(String[] args) {
    	metropolis.einwohner[0] = new Schurke("Azog der Sch�nder", 27990, "Orkismus");
    	metropolis.einwohner[1] = new Schurke("Hannnibal Lecter", 19910, "Kannibalismus");
    	metropolis.einwohner[2] = new Schurke("Onox", 270201, "Legendismus");
    	
//    	Syndikat syn = new Syndikat("Syndikat der Superschurken" ,new Schurke("xyz", 100, "test"), new Schurke("FFF",100,"lsdl"));
//    	System.out.println(syn.koerperschaftssteuer());
    	
    	Schurke sch = new Schurke("DerSchurke", 140000, "nichts");
    	System.out.println(sch.einkommensteuer());
    	
	}
}
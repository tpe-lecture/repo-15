package MetropolisTPE;
public class Kapitalgesselschaft extends Unternehmen implements Koerperschaftssteuerpflichtig {
protected Buerger[] gesellschafter;
    public Kapitalgesselschaft(int gewinn, String name) {
        super(gewinn, name);

    }
    public int koerperschaftssteuer(){//not implemented
        return 0;
    }
    public int gewerbesteuer(){//not implemented
        return 0;
    }
    @Override
    public int steuer() {
        // TODO Auto-generated method stub
        return 0;
    }


}

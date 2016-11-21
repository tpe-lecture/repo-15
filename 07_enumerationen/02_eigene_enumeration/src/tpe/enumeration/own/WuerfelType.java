package tpe.enumeration.own;

/**
 *
 * @author b.collins
 *
 */
public enum WuerfelType {
D4(4), D6(6), D8(8), D10(10), D12(12);
    private final int diceFaces;
    private WuerfelType(int  diceFaces){
        this.diceFaces = diceFaces;
    }
    public int getDiceFaces(){
        return diceFaces;
    }
    public double average(){

        return (this.getDiceFaces()+1)/2;
    }
}

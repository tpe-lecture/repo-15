package MetropolisTPE;
public abstract class Unternehmen implements Gewerbesteuerpflichtig {
protected int gewimnn;
protected String name;
public Unternehmen(int gewinn, String name){
    this.gewimnn = gewinn;
    this.name = name;
}
public int getGewimnn() {
    return gewimnn;
}
public void setGewimnn(int gewimnn) {
    this.gewimnn = gewimnn;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
}

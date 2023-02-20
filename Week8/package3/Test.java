import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;

public class Test {
    public static void main(String[] args) {
        CSE cs=new CSE();
        ECE es=new ECE();
        ME m=new ME();
        CE c=new CE();
        cs.display();
        es.display();
        m.display();
        c.display();
    }
}


import java.util.Vector;

public class vectorlist {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println(v);
        v.remove(0);
        v.remove(1);
        v.remove(2);
        v.remove(3);
        System.out.println(v);
        v.set(0, 20);
        v.set(1,30);
        v.isEmpty();
        System.out.println(v);
        v.clear();
        System.out.println(v);
    }
    
}

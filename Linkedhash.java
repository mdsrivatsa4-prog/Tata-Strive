
import java.util.LinkedHashSet;

public class Linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> t=new LinkedHashSet<>();
        t.add(5);
        t.add(1);
        t.add(2);
        t.add(30);
        t.add(4);
        System.out.println(t);
        t.remove(30);
        System.out.println(t);
        t.isEmpty();
        System.out.println(t);
        t.clear();
        System.out.println(t);
        


    }
    
}

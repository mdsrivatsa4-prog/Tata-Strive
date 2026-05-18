
import java.util.TreeSet;

public class treeset1 {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(5);
        t.add(1);
        t.add(2);
        t.add(30);
        t.add(4);
        System.out.println(t);
        t.remove(3);
        System.out.println(t);
        t.first();
        System.out.println(t);
        t.last();
        System.out.println(t);
        t.higher(10);
        System.out.println(t);
        t.lower(10);
        System.out.println(t);
        System.out.println(t.floor(20));
        System.out.println(t.ceiling(10));
        System.out.println(t);
    }
    
}

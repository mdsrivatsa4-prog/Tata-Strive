
import java.util.HashSet;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        h.add(5);
        h.add(4);
        h.add(3);
        h.add(2);
        System.out.println(h);
        h.remove(4);
        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        System.out.println(h.contains(2));
        System.out.println(h);
        h.clear();
        System.out.println(h);
        h.add(9);
        h.getClass();
        h.clone();
        System.out.println(h);
    }
    
}

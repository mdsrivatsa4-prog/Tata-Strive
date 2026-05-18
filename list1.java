import java.util.ArrayList;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        l.add(0,10);
        l.add(1,20);
        l.add(2,30);
        System.out.println(l);
        l.remove(0);
        l.remove(1);
        l.remove(2);
        System.out.println(l);
        l.clear();
        System.out.println(l);
        l.add(0,10);
        System.out.println(l);
        l.set(0 ,200);
        System.out.println(l);
        l.size();
        System.out.println(l);
        l.isEmpty();
        System.out.println(l);
        l.contains(l);
        System.out.println(l);
        


        
        
    }
    
}

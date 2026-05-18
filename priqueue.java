
import java.util.PriorityQueue;

public class priqueue {
    public static void main(String[]args){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.add(10);
        p.add(20);
        p.add(30);
        System.out.println(p);
        p.offer(40);
        p.offer(50);
        p.offer(60);
        System.out.println(p);
        p.poll();
        p.poll();
        System.out.println(p);
        p.remove();
        System.out.println(p);
        p.peek();
        System.out.println(p);
        //p.clear();
        System.out.println(p);
        System.out.println(p.size());
        System.out.println(p.isEmpty());
        System.out.println(p);
        p.contains(p);
        System.out.println(p);
        p.element();
        p.comparator();
        System.out.println(p);
        p.offer(10);
        p.offer(20);
        System.out.println(p);
        p.getClass();
        p.equals(p);
        System.out.println(p);
    }
    
}

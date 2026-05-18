
import java.util.ArrayDeque;

public class Arrdeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a=new ArrayDeque<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        System.out.println(a);
        a.pop();
        a.pop();
        System.out.println(a);
        a.offer(30);
        a.offer(40);
        System.out.println(a);
        a.offerFirst(10);
        a.offerLast(20);
        System.out.println(a);
        a.poll();
        a.poll();
        System.out.println(a);
        a.pollFirst();
        System.out.println(a);
        a.pollLast();
        System.out.println(a);
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.peek();
        System.out.println(a);
        a.peekFirst();
        System.out.println(a);
        a.peekLast();
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        System.out.println(a);
    }
    
}

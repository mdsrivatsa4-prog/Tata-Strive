import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s);
        s.remove(0);
        s.remove(1);
        s.remove(2);
        System.out.println(s);
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s);
        s.capacity();
        System.out.println(s);

        
    }
    
}

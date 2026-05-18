import java.util.LinkedList;

public class linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();
        l.add("Srivatsa");
        l.add("Suhas");
        l.add("Srujan");
        l.add("Shreyas");
        System.out.println(l);
        l.remove(0);
        l.remove(1);
        System.out.println(l);
        l.add(2,"Raju");
        l.add(3,"Kiran");
        System.out.println(l);
        l.addFirst("Abhi");
        System.out.println(l);
        l.addLast("Suhas");
        System.out.println(l);
        l.isEmpty();
        System.out.println(l);
        

        
    }
    
}

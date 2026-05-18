abstract class A10{
    abstract void demo();
}
public class anonomousclass {
    public static void main(String[] args) {
        A10 obj=new A10(){
            public void demo(){
                System.out.println("Java developer");
            }
        };
        obj.demo();
    }
    
    
}

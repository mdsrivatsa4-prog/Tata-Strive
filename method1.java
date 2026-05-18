
class demo{
    String name="Ajay";
    public void person()
    {
        System.out.println("Hello person");
    }
}
public class method1 {
    public static void main(String[] args) {
        demo d1=new demo();
        System.out.println(d1.name);
        d1.person();
    }
    
}

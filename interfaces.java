interface A9{
    void demo();
    void java();
}
class B6 implements A9{
    public void demo(){
        System.out.println("hello demo");
    }
    public void java(){
        System.out.println("hello java");
    }
}
public class interfaces {
    public static void main(String[] args) {
        A9 obj=new B6();
        obj.demo();
        obj.java();


    }
}

class A{
    public void java(){
        System.out.println("Java developers");
    }
}
class B extends A{
    public void react(){
        System.out.println("Dear developer");
    }

}

public class inhert {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        a1.java();
        b1.react();

    }
    
}

abstract class demo7{
    abstract void java();
    void display1(){
        System.out.println("Hello display");
    }
}
class abhi extends demo7{
    public void java(){
        System.out.println("Hello java");
    }
    public void display(){
        System.out.println("Hello react");
    }

}
public class Abstract {
    public static void main(String[] args) {
        abhi a=new abhi();
        a.java();
        a.display();
        a.display1();
    }
    
}

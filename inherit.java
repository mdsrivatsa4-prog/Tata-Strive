class DEMO1{
    public void grandfather(){
        System.out.println("Grandfather ");
    }
}
class DEMO2 extends DEMO1{
    public void father(){
        System.out.println("father ");
    }
}
class DEMO3 extends DEMO2{
    public void child(){
        System.out.println("child ");
    }
}
public class inherit {
    public static void main(String[] args) {
        DEMO3 obj6=new DEMO3();
        obj6.father();
        obj6.grandfather();
        obj6.child();
    }
}

abstract class demo3{
    abstract void message(String m);
    void sucess(){
        System.out.println("Data updated sucessfully");
    }
}
class demo6 extends demo3{
    void message(String m){
        System.out.println("Message sent: "+m);
    }

}
public class Abstract1 {
    public static void main(String[] args) {
        demo6 obj=new demo6();
        obj.sucess();
        obj.message("Hi how high are u");

    }
    
}

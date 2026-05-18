interface parents1{
    void parentdemo(String color);
}
interface parents2{
    default void childdemo(float height){
        System.out.println("Height: "+height);
    }
}
class child implements parents1,parents2{

    public void parentdemo(String color){
        System.out.println("Color: "+color);
    }
    public void childdemo(float height){
        System.out.println("Height: "+height);
    }
}
public class interfacess {
    public static void main(String[] args) {
        child g1=new child();
        g1.parentdemo("White");
        g1.childdemo(5.6f);

    }
    
}

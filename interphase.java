interface fruits{
    default void apple(String color,int price){
        System.out.println("Color of the apple: "+color+"\nPrice of the apple: "+price);
    }
    static void mango(String color,int price){
        System.out.println("Color of the mango: "+color+"\nPrice of the mango: "+price);
    }
}
class A4 implements fruits{
    
}
public class interphase {
    public static void main(String[] args) {
        A4 obj=new A4();
        obj.apple("Red",250);
        fruits.mango("Yellow",100);
    }
    
}

interface A4{
    default void person(String name,int age){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
    static void dog(String color){
        System.out.println("Color of the dog: "+color);
    }
}
class B7 implements A4{
    public void demo(String name,int age){
        System.out.println("Name: "+name+"\nAge: "+age);
    }

}
public class interfac {
    public static void main(String[] args) {
        A4 obj=new B7();
        obj.person("Suhas",22);
        A4.dog("white");
        

    }
    
}

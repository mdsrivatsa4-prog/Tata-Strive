interface i{
    void demo(int i,int j);

    default void java(){
        System.out.println("demo");
    }
    static void python(){
        System.out.println("Python");
    }
}
public class java8 {
    public static void main(String[]args){
        i obj=(int i,int j)->System.out.println("developers"+(i+j));
        i.python();
        obj.java();
        obj.demo(5, 10);
    }
    
}

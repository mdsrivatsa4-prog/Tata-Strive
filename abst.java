abstract class Vehicle3{
    abstract void start();
}
class car9 extends Vehicle3{
    public void start(){
        System.out.println("Car is going in 40km/h");
    }
}
class motorcycle extends Vehicle3{
    public void start(){
        System.out.println("Motorcycle is not faster than car");
    }
}
public class abst {
    public static void main(String[] args) {
        car9 c1=new car9();
        c1.start();
        motorcycle m1=new motorcycle();
        m1.start();


    }
    
}

import java.util.Scanner;

class Vehicle{
    int a;
    String fueltype;
    Vehicle(int a,String fueltype){
            this.a=a;
            this.fueltype=fueltype;
        }
        public void wheels(){
        System.out.println(a);
        System.out.println(fueltype);
    }
}
class Bike extends Vehicle{
    String color;
    String regno;
    Bike(int a,String fueltype,String color,String regno){
        super(a,fueltype);
        this.color=color;
        this.regno=regno;
    }
    public void V4(){
        System.out.println(color);
        System.out.println(regno);
    }
}
class Rider extends Bike{
    int price;
    Rider(int a,String fueltype,String color,String regno,int price){
        super(a,fueltype,color,regno);
        this.price=price;
    }
    public void B(){
        System.out.println(price);
    }
}
public class multi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of wheels");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("Fuel type");
        String fueltype=sc.nextLine();
        System.out.println("Enter the color");
        String color=sc.nextLine();
        System.out.println("Enter the regno");
        String regno=sc.nextLine();
        System.out.println("Enter the ex-showroom price");
        int price=sc.nextInt();

        Rider r1=new Rider(a,fueltype,color,regno,price);
        r1.wheels();
        r1.V4();
        r1.B();
        

    }
}

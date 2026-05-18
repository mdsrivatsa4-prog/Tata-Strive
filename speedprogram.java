import java.util.Scanner;

class car{
    int speed=100;
    public void carspeed(int a)
    {
        speed=speed+a;
        System.out.println("Speed of car is "+speed+" km/h");
    }
}

public class speedprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Accelator speed : ");
        int a=sc.nextInt();
        car c1=new car();
        c1.carspeed(a);
        System.out.print(c1.speed);
    }
}

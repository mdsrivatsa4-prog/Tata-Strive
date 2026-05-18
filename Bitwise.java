import java.util.Scanner;

public class Bitwise {
    public static void main(String[]args){
        System.out.println("Enter a and b values");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~b);
        System.out.println(a^b);
        System.out.println(a<<2);
        System.out.println(b>>1);
    }

}

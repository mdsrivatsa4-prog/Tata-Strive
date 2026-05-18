import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        System.out.println("Enter a and b");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("greater "+(a>b));
        System.out.println("graeterthan "+(a>=b));
        System.out.println("less "+(a<b));
        System.out.println("lessthan "+(a<=b));
        System.out.println("equals "+(a==b));
        System.out.println("not equals"+( a!=b));




        
    }
}

import java.util.Scanner;
public class Logical {
    public static void main(String[]args){
        System.out.println("Enter a and b values");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a>b && b==0);
        System.out.println(a!=b && b>2);
        System.out.println(a>b && b==0);

    }


    
}

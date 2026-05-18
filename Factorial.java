import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the factorial number u want : ");
        int factorial=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        
    }
    
}

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n  : ");
        int n=sc.nextInt();
        int f0=0;
        int f1=1;
        for(int i=0;i<n;i++){
            System.out.println(f0 +" ");

            int sum=f0+f1;
            f0=f1;
            f1=sum;
        }
    }
    
}

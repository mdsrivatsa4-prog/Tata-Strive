import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=1;
        int n=sc.nextInt();
        int sum=0;
        while(a<=n){
            sum=sum+a;
            a++;
        }
        System.out.println("sum is : " + sum);
        int avg=sum/n;
        System.out.println("avg is : " + avg);


    }
    
}

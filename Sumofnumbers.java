import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sum of first 100 number is : ");
        int sum=0;
        int i=0;
        do { 
            sum=sum+i;
            i++;
        } while (i<=100);
        System.out.print(sum);
    }
    
}

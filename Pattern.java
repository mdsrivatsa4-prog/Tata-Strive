import java.util.Scanner;

public class Pattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i>=1;i++){
            for(int k=0;k<=n-1;k++){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
                System.out.println( " *");
             }
        
            }
            System.out.println();

        }
    }


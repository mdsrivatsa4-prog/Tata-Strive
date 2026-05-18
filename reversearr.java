import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.print("Enter the array: ");
        for (int i = 0; i < n; i++) {
            number[i]=sc.nextInt();
        }
        System.out.println("Array reverse");
        for(int i=n-1;i>=0;i--){
            System.out.print(number[i]+" ");
        }
     }


 }
    


import java.util.Scanner;

public class arrayy {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int number []=new int[n];
        System.out.print("Enter the arrays: ");
        
        for (int i = 0; i < n; i++) {
            number[i]=sc.nextInt();    
        }
        int max=number[0];
        for(int i=0;i>n;i++){
        if(number[i]>max){
            max=number[i];
        }

    }

        System.out.println("Maximum number: "+max);


    }



    
}

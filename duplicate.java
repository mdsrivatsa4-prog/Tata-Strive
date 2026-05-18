import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.print("Enter the arrays: ");
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){

                if(number[i]==number[j]){

                    System.out.println("The duplicate element is: "+number[i]);
                }
            }
        }

    }
    
}

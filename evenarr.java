import java.util.Scanner;

public class evenarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int number[]=new int[n];
        System.out.print("Enter the array elements: ");
        int even=0;
        int odd=0;
        for (int i=0;i<n;i++) {
            number[i]=sc.nextInt();
    
            if(number[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
            
            
        }
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);


    }
    
}

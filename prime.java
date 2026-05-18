import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean temp=true;
        if(n<2){
            temp=false;
        }
        else{
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    temp=false;
                    break;
                }
                
                
            }
        }
        if(temp==true){
                    System.out.println("It is a prime number: ");

                }else {

                   System.out.println("It is not a prime number: ");  
                }
    }
    
}

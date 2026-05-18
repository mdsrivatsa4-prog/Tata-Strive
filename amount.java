import java.util.Scanner;

class method4{
    int balance=1000;
    public void deposit(int amount){
        balance=balance+amount;
        System.out.println("The current balance is : "+ balance);
        System.out.println(amount+" deposited to your bank");
    }
    public void withdrawn(int amount){
        if(amount<=balance){
            System.out.println("Sufficient balance");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class amount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int a=sc.nextInt();
        method4 obj1=new method4();
        obj1.deposit(a);
        System.out.print("Enter the amount withdrawn : ");
        int b=sc.nextInt();
        obj1.withdrawn(b);
        

        
    }

    
}

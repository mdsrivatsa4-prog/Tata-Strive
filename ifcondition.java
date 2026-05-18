import java.util.Scanner;

public class ifcondition {
    public static void main(String[]args){
        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
    
}

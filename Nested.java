import java.util.Scanner;

public class Nested {
    public static void main(String[]args){
        System.out.println("Enter the three numbers");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" is the Largest");
            }
            else{
                System.out.println(c+" is the Largest");

            }

        }
        else{
            if(b>c){
                System.out.println(b+" is the Largest");
            }
            else{
                System.out.println(c+" is the Largest");
            }

        }


    }
    
}

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        System.out.println("Enter the three numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println(a +" is the Largest");
        }
        else if(b>a && b>c){
            System.out.println(b +" is the Largest");
        }
        else{
            System.out.println(c +" is the Largest");
        }
        


    }}
    


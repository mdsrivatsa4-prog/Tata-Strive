import java.util.Scanner;
public class pPalindrome {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int rev=0;
        int temp;
        while(a!=0){
            int m=a%10;
            rev=rev*10+m;
            a=a/10;
        }
        if(temp==rev){
            System.out.println("It is a palindrome");

        }

    
}

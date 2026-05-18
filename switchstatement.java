import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks:");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Distinction");
                break;

            case 7:
                System.out.println("1st Class");
                break;

            case 6:
            case 5:
            case 4:
                System.out.println("2nd Class");
                break;

            default:
                System.out.println("Fail");
        }
    }
}
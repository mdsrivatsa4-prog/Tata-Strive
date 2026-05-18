import java.util.Scanner;

public class addofmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and column: ");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int [][]a=new int[r][c];
        int [][]b=new int[r][c];
        int [][]d=new int[r][c];
        System.out.print("Enter the 1st matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the second matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            } 
        }
        System.out.println("Addition of two matrix is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                d[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(d[i][j]+" ");;
            }
            System.out.println();
        }
    }
    
}

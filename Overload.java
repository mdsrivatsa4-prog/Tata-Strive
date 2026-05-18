class abf{
    public void overloading(int a,int b){
        System.out.println(a+b);
    }

    public void overloading(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class Overload {
    public static void main(String[] args) {
        abd a1=new abd();
        a1.overloading(4, 6);
    }
    
}

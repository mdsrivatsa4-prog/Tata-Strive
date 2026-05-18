class abd{
    public void overloading(int a,int b){
        System.out.println(a+b);
    }
}
class abe extends abd{
    public void overloading(int a,int b,int c){
        System.out.println(a-b+c);
    }

}
public class override {
    public static void main(String[] args) {
        abe a2=new abe();
        a2.overloading(4, 6,8);
    }
    
}

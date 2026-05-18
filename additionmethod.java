
class abc{
    public void add(int a,int b){
        System.out.println("Addition : "+(a+b));
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
public class additionmethod {
    public static void main(String[] args) {
        abc a1=new abc();
        a1.add(7,1);
        int r=a1.sub(6,2);
        int s=a1.mul(6,2);
        int t=a1.div(6,2);
        System.out.println("Substraction : "+r);
        System.out.println("Multiplication : "+s);
        System.out.println("Division : "+t);
    }
    
}

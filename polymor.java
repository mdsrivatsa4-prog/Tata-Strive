class overloading{
    public void area(int side){
        System.out.println("Area of square: "+ side);
    }
    public void area(int l,int b){
        System.out.println("Area of rectangle: "+ l*b);
    }
    public void area(float r){
        System.out.println("Area of Circle: "+ 3.14*r*r);
    }

}
public class polymor {
    public static void main(String[] args) {
        overloading o1=new overloading();
        o1.area(3);
        o1.area(4,6);
        o1.area(2.4f);
    }
    
}

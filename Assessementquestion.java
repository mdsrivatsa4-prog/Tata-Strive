class car4{
    String color;
    int price;
    car4(String color,int price){
        this.color=color;
        this.price=price;
    }
        public void cardetailss(){
            System.out.println("color :"+color+" \nprice"+price);
     }
}
class BMW extends car4{
    BMW(String color,int price){
        super(color,price);
    }
    public void Bm(){
        System.out.println("Color of bmw"+color+"\n Price of bmw"+price);
    }
}
class Audi extends car4{
    Audi(String color,int price){
        super(color,price);
    }
    public void au(){
        System.out.println("Audi color"+color+"\n Audi price"+price);
    }
}
public class Assessementquestion {
    public static void main(String[] args) {
        BMW car=new BMW("red",500000);
        car.Bm();

    }
    
}

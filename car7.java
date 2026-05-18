
class abc6{
    public void nexon(String color,String regno){
        System.out.println("Color : "  +color+"\n"+"Regno : "+regno);
    }
    public void creta(String color,String fueltype ){
        System.out.println("Color : "+color+"\n" + "Fuel type: "+fueltype);
    }
}

public class car7{
    public static void main(String[] args) {
        abc6 a1=new abc6();
        a1.nexon("black","KA50ER8973");
        a1.creta("white","petrol");
        
    }

}
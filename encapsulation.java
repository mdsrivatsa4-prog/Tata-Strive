class az{
    private String pname="apple";
    private int price=200;

    public String getpname(){
        return pname;
    }
    public int getprice(){
        return price;
    }
    public void setpname(String pname){
        this.pname=pname;
    }
    public void setprice(int price){
        this.price=price;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        az a1=new az();
        System.out.println("The old product is : "+a1.getpname());
        System.out.println("The old price is : "+a1.getprice());
        a1.setpname("Kashmir apple");
        a1.setprice(250);
        System.out.println("\nThe new product is : "+a1.getpname());
        System.out.println("The new price is : "+a1.getprice());
    }
    
}

class zepto extends Thread{
    String id;
    String pname;
    int price;
    zepto(String id,String pname,int price){
        this.id=id;
        this.pname=pname;
        this.price=price;
    }
    public void run(){
        System.out.println("Order conformation is done");
        System.out.println("ID: "+id+"\nName: "+pname+"\nPrice: "+price);
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Order is packing");
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Order is ready");
    }

}
class instamart extends  Thread{
    String id;
    String pname;
    int price;
    instamart(String id,String pname,int price){
        this.id=id;
        this.pname=pname;
        this.price=price;
    }
    public void run(){
        System.out.println("Order conformation is done");
        System.out.println("ID: "+id+"\nName: "+pname+"\nPrice: "+price);
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Order is packing");
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Order is ready");
    }

}
class bigbasket extends Thread{
    String id;
    String pname;
    int price;
    bigbasket(String id,String pname,int price){
        this.id=id;
        this.pname=pname;
        this.price=price;
    }
    public void run(){
        System.out.println("Order conformation is done");
        System.out.println("ID: "+id+"\nName: "+pname+"\nPrice: "+price);
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Order is packing");
        try{
        Thread.sleep(5000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Order is ready");
    }

}
class gamess extends Thread{

    public void run(){

        System.out.println("Game is loading");
        System.out.println("I used to play freefire");
    }
 
    }
public class multithread {
    public static void main(String[] args) {
        zepto z=new zepto("OUEY32796", "Biryani", 260);
        instamart i=new instamart("NMBVLJ29381", "Mushroom curry", 460);
        bigbasket b=new bigbasket("ASDKHG92136", "Fruits", 1200);
        gamess g=new gamess();
        z.run();
        i.run();
        b.run();
        g.run();
    }
    
}

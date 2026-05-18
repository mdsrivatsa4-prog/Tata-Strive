class user extends Thread{
    String id;
    String name;
    String source;
    String destination;
    int price;
    int avecaption;

    user(String id,String name,String source,String destination,int price,int avecaption){
        this.id=id;
        this.name=name;
        this.source=source;
        this.destination=destination;
        this.price=price;
        this.avecaption=avecaption;

    }
    public void run(){
        System.out.println("Waiting for caption");
        try {
            Thread.sleep(3000);
        } catch (Exception e)
         {
            System.out.println(e);
        }
        if(avecaption>0){
            System.out.println("Booked for "+name);
        }
        else{
            System.out.println("No caption available");
        }
    }

}
class caption extends Thread{
    String id;
    String name;
    String app;

    caption(String id,String name,String app){
        this.id=id;
        this.name=name;
        this.app=app;

    }
    public void run(){
        System.out.println("Waiting for user");
        try {
            Thread.sleep(3000);
        } catch (Exception e)
         {
            System.out.println(e);
        }
        if(app=="OLA"){
            System.out.println("Cab booked for"+name);
        }
        else{
            System.out.println("Cab cancelled");
        }
    }

}
class cab extends Thread{
    String cabnum;
    int noofseats;
    String ac;

    cab(String cabnum,int noofseats,String ac){
        this.cabnum=cabnum;
        this.noofseats=noofseats;
        this.ac=ac;

    }
    public void run(){
        System.out.println("Cab details:"+cabnum+" "+noofseats+" "+ac);
    }

}
public class multithread1 {
    public static void main(String[] args) {
        user u=new user("ASGXH387873", "Pranav", "Yelahanka","Hebbal",160, 0);
        caption c=new caption("ERUIYER92364","Bharath", "UBER");
        cab c1=new cab("KA50UT7478", 7, "Present");
        u.start();
        c.start();
        c1.start();

    } 
}

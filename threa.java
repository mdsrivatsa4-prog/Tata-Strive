class zomato extends Thread{
    
        public void run(){
            for(int i=0;i<5;i++){
            System.out.println("You have a order from zomato");
            }
        }
    }

class Swiggy extends Thread{
    
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("You have a order from Swiggy");
        }
    }
}
public class threa {
    public static void main(String[] args) {
        zomato z=new zomato();
        Swiggy s=new Swiggy();
        z.start();
        s.start();
    }
    
}

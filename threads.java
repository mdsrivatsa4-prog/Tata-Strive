class zomatos implements Runnable{
    
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("U have order from zomato");
        }
    }
}
class swiggys implements Runnable{
    
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("U have order from swiggy");
        }
    }
}
public class threads {
    public static void main(String[] args) {
        zomatos z1=new zomatos();
        swiggys s1=new swiggys();
        Thread t1=new Thread(z1);
        Thread t2=new Thread(s1);
        try{
        Thread.sleep(2000);
        }catch(Exception e){
            System.out.println(e);
        }
        t1.start();
        try{
        Thread.sleep(7000);
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();



    }
    
}

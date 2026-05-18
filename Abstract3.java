abstract class bank4{
    int transactionid;
    int amount;
    bank4(int transactionid,int amount){
        this.transactionid=transactionid;
        this.amount=amount;
        
    }
    abstract void display();
}
class store extends bank4{
    String storename;
    store(int transactionid,int amount,String storename){
        super(transactionid, amount);
        this.storename=storename;
    }
    public void display(){
        System.out.println("Transaction id: "+transactionid+"\nAmount: "+amount+"\nStorename: "+storename);
    }
}
class refund extends bank4{
    String refundreason;

    refund(int transactionid,int amount,String refundreason) {
        super(transactionid,amount);
        this.refundreason=refundreason;
    }
    public void display(){
        System.out.println("Transaction id: "+transactionid+"\nAmount: "+amount+"\nRefund reason: "+refundreason);
    }
}
public class Abstract3 {
    public static void main(String[] args) {
        store s=new store(1328746,5000, "Amazon");
        s.display();
        refund r=new refund(234634, 3543, "No properly arranged");
        r.display();

        
    }
    
}

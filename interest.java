class Bank{
    public double interest1(){
        return 9.5;
    }
}
class Vehicleloan extends Bank{
    public double interest1(){
        return 7.5;
    }
}
class Educationloan extends Bank{
    public double interest1(){
        return 5;
    }
}
public class interest {
    public static void main(String[] args) {
        Vehicleloan v1=new Vehicleloan();
        Educationloan e1=new Educationloan();
        Bank b3=new Bank();
        System.out.println("The interest rate of vehicleloan is: "+v1.interest1());
        System.out.println("The interest rate of educationloan is: "+e1.interest1());
    }
    
}

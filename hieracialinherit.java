class Bank{
    String ifsc;
    Bank(String ifsc){
        this.ifsc=ifsc;
    }
    public void W(){
            System.out.println("ifsc code: "+ifsc);
        }
}
class person1 extends Bank{
    String name;
    String address;
    person1(String ifsc, String name,String address){
        super(ifsc);
        this.name=name;
        this.address=address;
    }
        public void X(){
            System.out.println(name+" "+address);
        }
    }

class person2 extends Bank{
    String name;
    long acc;
    person2(String ifsc, String name, long acc){
        super(ifsc);
        this.name=name;
        this.acc=acc;
    }
        public void Y(){
            System.out.println(name+" "+acc);
        }
    }

public class hieracialinherit {
    public static void main(String[] args) {
        person1 p1=new person1("ouwiwfqivbqwvb","Suhas","Ramesh");
        p1.W();
        p1.X();
        person2 p2=new person2("ouwiwfqivbqwvb","Suhas",45064636);
        p2.W();
        p2.Y();



    }
}

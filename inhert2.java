class dog{
    String name;
    String color;
    dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    public void dogdetails(){
        System.out.println(name+" "+color);
    }
}
class babydog extends dog{
    String breed;
    int age;
    babydog(String name,String color,String breed,int age){
        super(name,color);
        this.breed=breed;
        this.age=age;
    }
    public void babydetails(){
        System.out.println(name+""+color+""+breed+""+age);
    }

}
public class inhert2 {
    public static void main(String[] args) {
        babydog bb=new babydog("Julie","White","Lab",2);
        bb.dogdetails();
        bb.babydetails();
    }
    
}

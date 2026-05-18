class abcd{
    String name;
    int age;
    abcd(String name1,int age1){
        name=name1;
        age=age1;
    }
    public void java(){
        System.out.println(name +" "+age);
    }
}

public class constructor1{
    public static void main(String[] args) {
        abcd a1=new abcd("Ajay",18);
        a1.java();
        
    }
}
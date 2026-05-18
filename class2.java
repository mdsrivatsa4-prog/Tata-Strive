class person
{
    String name="AJAY";
    int age=18;

}
class dog
{
    String name="Charlie";
    String color="White";
    int age=5;
}
public class class2 {
    public static void main(String[] args) {
        person obj=new person();
        person obj1=new person();
        dog obj3=new dog();
        System.out.println(obj.name+" "+obj1.age+" "+obj3.age);
        System.out.println("dog.name : "+obj3.name+"\n"+"dog.age : "+obj3.age);
    }
    
}

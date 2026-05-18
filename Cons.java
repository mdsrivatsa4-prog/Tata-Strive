class dog{
        String name;
        String color;
        String breed;
        int age;
    dog(String name,String color,String breed,int age){
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;
    }
    public void dogdetails(){
        System.out.println("name:"+name+"\n"+"color:"+color+"\n"+"breed:"+breed+"\n"+"age:"+age);
    }
}
public class Cons {
    public static void main(String[] args) {
        dog d1=new dog("Danny","Black","Labdour",5);
        d1.dogdetails();


    }
    
}

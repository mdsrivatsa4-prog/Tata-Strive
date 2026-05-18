class Animal{
    String color;
    Animal(String color){
        this.color=color;
    }
    public void animaldetails(){
        System.out.println("Color of animal: "+color);
    }
}
class Animal1 extends Animal{
    String name;
    int age;
    Animal1(String color,String name,int age){
        super(color);
        this.name=name;
        this.age=age;
    }
    public void animal1details(){
        System.out.println("Name of the animal: "+name+"\nAge of the animal: "+age);
    }
}
class Animal2 extends Animal{
    String breed;
    Animal2(String color,String name,int age,String breed){
        super(color);
        this.breed=breed;
    }
    public void animal2details(){
        System.out.println("Breed of the animal: "+breed);
    }
}
public class Hiera {
    public static void main(String[] args) {
        Animal a1=new Animal("Black");
        a1.animaldetails();
        Animal1 a2=new Animal1("Brown", "Dog ", 20);
        a2.animal1details();
        Animal2 a3=new Animal2("white", "Danny", 5, "German Shepard");
        a3.animal2details();
    }
    
}

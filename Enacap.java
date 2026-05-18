class game{
    private String pname="Ramesh";
    private int health=10;
    private int level=20;

    public String getpname(){
        return pname;
    }
    public int gethealth(){
        return health;
    }
    public int getlevel(){
        return level;
    }

    public void setpname(String pname){
        this.pname=pname;
    }
    public void sethealth(int health){
       
        if(health <=20){

            System.out.println("You will die soon");
        }
        else{
            System.out.println("You will survive");
        }
         this.health=health;
    }
    public void setlevel(int level){
        this.level=level;
    }
}
public class Enacap {
    public static void main(String[] args) {
        game g1=new game();
        System.out.println("The old name is: "+g1.getpname());
        System.out.println("The old health is: "+g1.gethealth());
        System.out.println("The old level is: "+g1.getlevel());
        g1.setpname("Suhas");
        g1.sethealth(6);
        g1.setlevel(67);
        System.out.println("The new name is: "+g1.getpname());
        System.out.println("The new health is: "+g1.gethealth());
        System.out.println("The new level is: "+g1.getlevel());
    }
    
}

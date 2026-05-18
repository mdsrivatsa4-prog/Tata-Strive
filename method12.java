class mobile{
    public void mobiledetails(String name,String color,int ram,int rom){
        System.out.println(name);
        System.out.println(color);
        System.out.println(ram);
        System.out.println(rom);
    }
    public void message(int battery){
        System.out.println("");
        if(battery<20){
            System.out.println("Battery is low");
        }
        else if(battery<=20 && battery<=60){
            System.out.println("Battery backup is needed");
        }
        else{
            System.out.println("Sufficient battery");
        }
    }
}
    public class method12 {
        public static void main(String[] args) {
            mobile m1=new mobile();
            m1.mobiledetails("Vivo","Purple",256,8);
            m1.message(80); 
        }   
}

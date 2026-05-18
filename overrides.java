class phone{
    String name;
    String color;
    String ram;
    String rom;

    public void mobile(String name,String color,String ram,String rom){
        System.out.println(" Name of mobile"+name+"\n Color of mobile"+color+"\n Ram of the mobile"+ram+"\n Rom of the mobile"+rom);
    }
}
class telephone extends phone{
    String name;
    String color;
    String ram;
    String rom;
    String processor;

    public void mobile(String name,String color,String ram,String rom,String processor){
        System.out.println(" Name of mobile: "+name+"\n Color of mobile: "+color+"\n Ram of the mobile: "+ram+"\n Rom of the mobile: "+rom+"\n Processor of the mobile: "+processor);
    }
}

public class overrides {
    public static void main(String[] args) {
        telephone t1=new telephone();
        t1.mobile("Iphone 17","Orange", "1Tb", "64gb","Apple A19 pro chip");
    }
    
}

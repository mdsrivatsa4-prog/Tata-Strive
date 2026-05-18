class outer2{
    void demo(){
        class inner2{
            void demo2(){
                System.out.println("inner class");
            }
        }
        inner2 o1=new inner2();
        o1.demo2();
    }
}
public class methodclass {
    public static void main(String[] args) {
        outer2 o2=new outer2();
        o2.demo();
    }
    
}

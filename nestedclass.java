class outer{
    private class inner{
        void sys(){
            System.out.println("Inner class");
        }
    }
    void fullstack(){
        inner i1=new inner();
        i1.sys();
    }
}
public class nestedclass {
    public static void main(String[] args) {
        outer o1=new outer();
        o1.fullstack();
    }
    
}

public class arrindexoutofbound {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        try{
            System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Modification not possible");
        }
        
        
    }
    
}

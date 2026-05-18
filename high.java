class University{
    String name;
    University(String name){
        this.name=name;
    }
    public void Unidetails(){
        System.out.println("University name: "+name);
    }
}
class College1 extends University{
    String address;
    College1(String name,String address){
        super(name);
        this.address=address;
    }
    public void coll1details(){
        System.out.println("College1 address: "+address);
    }
}
class College2 extends University{
    int number_of_dept;
    College2(String name,String address,int number_of_dept){
        super(name);
        this.number_of_dept=number_of_dept;
    }
    public void coll2details(){
        System.out.println("Number of department: "+number_of_dept);
    }
}
    public class high {
        public static void main(String[] args) {
            University u1=new University("Visvashwara University");
            u1.Unidetails();
            College1 c5=new College1("Sri Venkateshwara College","Vidyanagar Chikkajala");
            c5.coll1details();
            College2 c6=new College2("Sri Venkateshwara College","Vidyanagar Chikkajala",56);
            c6.coll2details();


        }
    
}

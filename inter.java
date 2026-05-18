interface com1{ 
    void cname(String cname);
    void address(String address);
}

interface com2 extends com1{
    void empname(String empname);
    void salary(int salary);
    void role(String role);
}
interface com3 extends com1{
    void dept(String dept);
    void project(String project);
}
class comp implements com2,com3{
    public void cname(String cname){
        System.out.println("Company name"+cname);
    }
    public void address(String address){
        System.out.println("Company address"+address);
    }
    public void empname(String empname){
        System.out.println("Employee name"+empname);
    }
    public void salary(int salary){
        System.out.println("Salary is : "+salary);
    }
    public void role(String role){
        System.out.println("Role: "+role);
    }
    public void dept(String dept){
        System.out.println("Department name"+dept);
    }
    public void project(String project){
        System.out.println("Project name"+project);
    }

}
public class inter {
    public static void main(String[] args) {
        comp c1=new comp();
        c1.address("Yelahanka");
        c1.cname("Srivatsa");
        c1.empname("Srivatsa");
        c1.salary(1200000);
        c1.dept("CSE");
        c1.role("Developer");
        c1.project("n8n");
        
    }
    
}

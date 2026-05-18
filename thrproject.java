class emp1 extends Thread{
    String id;
    String name;
    String roll;
    String cname;
    String dept;
    emp1(String id,String name,String roll,String cname,String dept){
        this.id=id;
        this.name=name;
        this.roll=roll;
        this.cname=cname;
        this.dept=dept;
    }
    public void emp1details(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ID: "+id+"\nName: "+name+"\nRoll: "+roll+"\nCompany Name: "+cname+"\nDepartment: "+dept);
    }

}
class emp2 extends Thread{
    String id;
    String name;
    String roll;
    String cname;
    String dept;
    emp2(String id,String name,String roll,String cname,String dept){
        this.id=id;
        this.name=name;
        this.roll=roll;
        this.cname=cname;
        this.dept=dept;
    }
    public void emp2details(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ID: "+id+"\nName: "+name+"\nRoll: "+roll+"\nCompany Name: "+cname+"\nDepartment: "+dept);
    }

}
class emp3 extends Thread{
    String id;
    String name;
    String roll;
    String cname;
    String dept;
    emp3(String id,String name,String roll,String cname,String dept){
        this.id=id;
        this.name=name;
        this.roll=roll;
        this.cname=cname;
        this.dept=dept;
    }
    public void emp3details(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("ID: "+id+"\nName: "+name+"\nRoll: "+roll+"\nCompany Name: "+cname+"\nDepartment: "+dept);
    }

}
class company1 extends Thread{
    String name;
    String branch;
    String address;

    company1(String name,String branch,String address) {
        this.name=name;
        this.branch=branch;
        this.address=address;
    }
    public void comp1details(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Company name: "+name+"\nBranch: "+branch+"\nAddress: "+address);
    }
}
class company2 extends Thread{
    String name;
    String branch;
    String address;

    company2(String name,String branch,String address) {
        this.name=name;
        this.branch=branch;
        this.address=address;
    }
    public void comp2details(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Company name: "+name+"\nBranch: "+branch+"\nAddress: "+address);
    }
}
class company3 extends Thread{
    String name;
    String branch;
    String address;

    company3(String name,String branch,String address) {
        this.name=name;
        this.branch=branch;
        this.address=address;
    }
    public void comp3details(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("Company name: "+name+"\nBranch: "+branch+"\nAddress: "+address);
    }
}


public class thrproject {
    public static void main(String[] args) {
        emp1 e1=new emp1("YUGD7289R", "Suhas", "Developer", "Infosys", "Technical");
        emp2 e2=new emp2("LSJVJB34579", "Srivatsa", "Developer", "Google", "Technical");
        emp3 e3=new emp3("SABNSDVB3987", "Tharun", "HR", "IBM", "Human Resource");
        company1 c1=new company1("Oracle","Whitefield","No 22 Whitefield");
        company2 c2=new company2("Meta","Electronic City","No 87 Electronic City");
        company3 c3=new company3("ABB","M G Road","No 69 M G road");
        e1.emp1details();
        e2.emp2details();
        e3.emp3details();
        c1.comp1details();
        c2.comp2details();
        c3.comp3details();

    }
    
}

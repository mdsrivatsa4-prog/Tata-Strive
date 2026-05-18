class Student{
    String sname="Sri";
    String branch="CSE";
    int roll=157;
    long phoneNo=982314879;
}
class Employee{
    String ename="Srivatsa";
    int salary=60000;
    int eid=69;
}
    public class class1 {
        public static void main(String[] args) {
            Student obj1=new Student();
            Employee obj2=new Employee();
            System.out.println("Student.sname : "+obj1.sname+"\n"+"Student.branch : "+obj1.branch+"\n"+"Student.roll : "+obj1.roll+"\n"+"Student.phoneNo : "+obj1.phoneNo);
            System.out.println("Employee.ename : "+obj2.ename+"\n"+"Employee.salary : "+obj2.salary+"\n"+"Employee.eid : "+obj2.eid);
            
        }
    }
    


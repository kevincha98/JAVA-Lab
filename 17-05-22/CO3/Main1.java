class Main1
{
    public static void main(String[] args) {
       Teacher teacObj[] = new Teacher[2];
       teacObj[0] = new Teacher("1","A","AB",11,"ABC","ABCD");
       teacObj[1] = new Teacher("2","B","BC",11,"BCD","BCDE");
       teacObj[0].display();
       teacObj[1].display();
    }
}
class Employees {
    String Empid;
    String Name;
    String Address;
    int Salary;
    Employees(String id,String name,String addr,int salary){
        this.Empid   = id;
        this.Name    = name;
        this.Address = addr;
        this.Salary  = salary;
    }
    void display(){
        System.out.println("EmpID   : " + this.Empid);
        System.out.println("Name    : " + this.Name);
        System.out.println("Address : " + this.Address);
        System.out.println("Salary  : " + this.Salary);
    }
}
class Teacher extends Employees{  
    String Department;
    String Subject;
    Teacher(String id,String name,String addr,int salary,String dept,String subj){
        super(id,name,addr,salary);
        this.Department=dept;
        this.Subject=subj;
    }
    void display(){
        System.out.println("..........................................");
        super.display();
        System.out.println("Dept Name : " + this.Department);
        System.out.println("Subject Name : " + this.Subject);
        System.out.println("..........................................");
    }
}
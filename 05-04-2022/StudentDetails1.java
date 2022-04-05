class Student{
	int stid,mark1,mark2,mark3;
	String stname;
	
	Student(){
		stid=015;
		stname="Kevin";
		mark1=12;
		mark2=06;
		mark3=14;
	}
	Student(int id,String name,int m1,int m2, int m3){
		stid=id;
		stname=name;
		mark1=m1;
		mark2=m2;
		mark3=m3;
	}
	Student(int m1,int m2, int m3){
		stid=021;
		stname="Manu";
		mark1=m1;
		mark2=m2;
		mark3=m3;
		
	}
	void display(){
		System.out.println("STUDENTS DETAILS");
		System.out.println("ID    :" +stid);
        System.out.println("Name  :" +stname);
		System.out.println("Mark1 :" +mark1);
		System.out.println("Mark2 :" +mark2);
		System.out.println("Mark3 :" +mark3);
		System.out.println('\n');
		
		
	}
	
}
      
	  
public class StudentDetails1{
	public static void main(String args[]){
		Student obj1=new Student();
		obj1.display();
		Student obj2=new Student(002,"Roy",15,10,20);
		obj2.display();
		Student obj3=new Student(14,19,15);
		obj3.display();
    }
}	
	
	  
	  


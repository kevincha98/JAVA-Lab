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
	
}
      
	  
public class StudentDetails{
	public static void main(String args[]){
		
		Student obj1=new Student();
		Student obj2=new Student(002,"Roy",15,10,20);
		Student obj3=new Student(14,19,15);
	    System.out.println(obj1.stid);
        System.out.println(obj1.stname);
		System.out.println(obj1.mark1);
		System.out.println(obj1.mark2);
		System.out.println(obj1.mark3);
		
		System.out.println('\n');
		
		System.out.println(obj2.stid);
		System.out.println(obj2.stname);
		System.out.println(obj2.mark1);
		System.out.println(obj2.mark2);
		System.out.println(obj2.mark3);
		
		System.out.println('\n');
		
		System.out.println(obj3.stid);
		System.out.println(obj3.stname);
		System.out.println(obj3.mark1);
		System.out.println(obj3.mark2);
		System.out.println(obj3.mark3);
		
    }
}	
	
	  
	  


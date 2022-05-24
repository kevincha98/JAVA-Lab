class Outer{
	int x=10;
	class Inner{
		int y=5;
		}
}	
public class Outer1{
			public static void main(String args[]){
				Outer myOuterobj=new Outer();
				Outer.Inner myInnerobj=myOuterobj.new Inner();
				System.out.println(myOuterobj.x);
				System.out.println(myInnerobj.y);
			}
}
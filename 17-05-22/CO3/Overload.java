import java.util.*;
class OverloadDemo
{
    void area(float x)
    {
        System.out.println("the area of the square is "+(x*x)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Overload 
{
     public static void main(String args[]) 
	{
		int square;
		int rect1,rect2;
		double circ;
	    OverloadDemo ob = new OverloadDemo();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the length of a square");
	    square=sc.nextInt();
		System.out.println("enter the length and breadth of a rectangle");
	    rect1=sc.nextInt();
		rect2=sc.nextInt();
		System.out.println("enter the radius of a circle");
	    circ=sc.nextInt();
	    ob.area(square);
	    ob.area(rect1,rect2);
	    ob.area(circ);
    }
}
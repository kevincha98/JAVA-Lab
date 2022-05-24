class CPU
{
	int price=80000;
	class Processor
	{
		int port_no=256;
		String manufacture="Intel Core";
	}
	public static class RAM
	{
		static int memory=6;
		String company="HP";
	}
}
public class Example2
{
	public static void main(String args[])
	{
		CPU obj1 = new CPU();
		CPU.Processor obj2=obj1.new Processor();	
		System.out.println("the number of ports  : "+obj2.port_no);
		System.out.println("the Manufacturer     : "+obj2.manufacture);
		System.out.println("the Memory size      : "+CPU.RAM.memory);
		CPU.RAM obj3 =new CPU.RAM();
		System.out.println("the Company          : "+obj3.company);
	}
}
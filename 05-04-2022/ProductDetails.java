class Product{
	String pcode, pname;
	double price;
	void details(){
		System.out.println("PRODUCT DETAILS");
		System.out.println("PCode : "+pcode);
		System.out.println("PName : "+pname);
		System.out.println("Price : "+price);
	}
}
public class ProductDetails{
	public static void main(String args[]){
		Product p1 = new Product();
		p1.pcode = "MJ9PI";
		p1.pname = "SUMSUNG M2";
		p1.price = 10999;
		System.out.println("\nProduc 1:-");
		p1.details();
		
		Product p2 = new Product();
		p2.pcode = "X5HM";
		p2.pname = "Mi Band 4";
		p2.price = 1799;
		System.out.println("\nProduc 2:-");
		p2.details();
				
		Product p3 = new Product();
		p3.pcode = "E5248";
		p3.pname = "IPHONE 13";
		p3.price = 120000;
		System.out.println("\nProduc 3:-");
		p3.details();
				
		if(p1.price<p2.price && p1.price<p3.price){
			System.out.println("\n\nProduct with lowest price is :");
			p1.details();
		}
		else if(p2.price < p3.price){
			System.out.println("\nProduct with lowest price is :\n");
			p2.details();
		}
		else
		{
			System.out.println("\nProduct with lowest price is :\n");
			p3.details();
		}
	}
}
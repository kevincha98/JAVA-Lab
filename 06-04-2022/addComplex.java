import java.util.Scanner;
class complex{
    int r,b;
    void display(){
        System.out.println("Complex Number is "+r+"+"+b+"i");
    }
}
public class addComplex {
    public static void main(String[] args) {

        complex c1=new complex();
        complex c2=new complex();
        complex c3=new complex();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of complex number 1");
        c1.r=s.nextInt();
        c1.b=s.nextInt();
        System.out.println("Enter the real and imaginary parts of complex number 2");
        c2.r=s.nextInt();
        c2.b=s.nextInt();
        c3.r=c1.r+c2.r;
        c3.b=c1.b+c2.b;
        c3.display();
        
    }
    
}


import Package_B.*;
public class main_graphicss {
    public static void main(String []args){
        package_graphics testObj = new package_graphics();
System.out.println("Area of Reactangle is:");
        System.out.println(testObj.recArea(3,4));
		System.out.println("Area of Circle is:");
        System.out.println(testObj.cirArea(8));
		System.out.println("Area of Square is:");
        System.out.println(testObj.squArea(12));
		System.out.println("Area of Triangle is:");
        System.out.println(testObj.triArea(15,3));    }
}

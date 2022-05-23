import java.util.Scanner;

public class Circle {
	int radius;
	float pi;
	public Circle() {
		pi=3.145F;
	}
	public Circle(int radius) {
		this.radius=radius;
		this.pi=3.145F;
	}
	
	public void Area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		radius=sc.nextInt();
		float area=pi*radius*radius;
		System.out.println("area of circle is"+area);
		
	}
	

}

import java.util.Scanner;

public class OOPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Programming");
		System.out.println("\t Hello All");
		/*Calculator obj=new Calculator();
		obj.num1=23;
		obj.num2=34;
		System.out.println(obj.num1);
		System.out.println(obj.num2);
		obj.addition();
		obj.subtraction();
		System.out.println("Now code for calculator 2");
		Calculator obj2=new Calculator();
		obj2.num1=78;
		obj2.num2=23;
		obj2.subtraction();*/
		// next code
		
		/*int x,y;
		Calculators obj=new Calculators();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		obj.addition(x, y);
		int res=obj.subtraction(x, y);
		System.out.println("difference is"+res);
		System.out.println(obj.message("Aakash"));*/
		
		/*LoopingDemo obj=new LoopingDemo();
		obj.table(7);
		obj.addition(2,3);
		obj.addition(2,3,4,5,6);
		obj.addition(2,3,9,8,7,6,5,4);
		obj.addition(2,3,0,1,2,3,4,5,6,7,8,9);
		obj.addition();*/
		
//	Circle obj=new Circle();
//	
//	obj.Area();
	/*Employee obj1=new Employee();
	obj1.Acceptdetails();
	obj1.DisplayDetails();*/
Scanner sc=new Scanner(System.in);
//int x,y;
//x=sc.nextInt();
//y=sc.nextInt();
//if(x==y)
//{
//	System.out.println("values of both are equal");
//}
//else {
//	System.out.println("vlaue is different");
//}
//String str1=sc.next();
//String str2=sc.next();
//if(str1.equals(str2)) {
//	System.out.println("equal");
//	}
//else {
//	System.out.println("not equal");
//}
Genericclass<Integer> obj=new Genericclass<Integer>();
obj.x=12;
obj.y=32;
obj.display();

Genericclass<String> obj2=new Genericclass<String>();
obj2.x="Hello";
obj2.y="Java";
obj2.display();

Genericclass<Float> obj3=new Genericclass<Float>();
obj3.x=12.0f;
obj3.y=56.0f;
obj3.display();

Genericclass<Character> obj4= new Genericclass<Character>();
obj4.x='H';
obj4.y='i';
obj4.display();
	
	
	
	
	
		
		
		
		

	}

}

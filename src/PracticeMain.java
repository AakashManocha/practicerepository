import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		int x,y;
		// TODO Auto-generated method stub
		Practice obj=new Practice();
		obj.num1=12;
		obj.num2=32;
		obj.addition();
		obj.subtraction();
		Practice obj1=new Practice();
		obj1.num1=33;
		obj1.num2=66;
		obj1.addition();
		Scanner sc= new Scanner(System.in);
		Practice obj2=new Practice();
		x=sc.nextInt();
		y=sc.nextInt();
		int res=obj2.subtraction(x, y);
		System.out.println(res);
		Practice obj3=new Practice();
		obj3.addition();
		obj3.addition(2,3);
		obj3.addition(1,2,3,4,5,6,7,8);
		

	}

}

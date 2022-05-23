
public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   ICalculator calc=() -> System.out.println("hello lambda");
//   calc.display();
		ICalculator calc=(a, b) -> {
			return a+b;
		};
		int c=calc.addition(5, 6);
		System.out.println("new repository created");
		System.out.println(c);
		IPractice prac=(x, y) -> System.out.println(x*y);
		prac.multiplication(6, 9);
	}
}
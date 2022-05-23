
public class Practice {
	int num1;
	int num2;
  public void addition() {
	  int sum=num1+num2;
	  System.out.println(sum);
	  
  }
  public void subtraction() {
	  int sub=num1-num2;
	  System.out.println(sub);
  }
  public void addition1(int num1,int num2) {
	  int sum=num1+num2;
	  System.out.println(sum);
  }
  public int subtraction(int num1,int num2) {
	  int sub=num1-num2;
	  return sub;
  }
  public void addition(int... a) {
	  int sum=0;
	  for(int num:a) {
		  sum=sum+num;
		  
	  }
	  System.out.println(sum);
  }
}

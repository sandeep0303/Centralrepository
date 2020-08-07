package pkg2;

public class Arithmetic {
public int sum(int a, int b) {
	int c;
	c=a+b;
	System.out.println("Result of sum is: "+c);
	return c;
}
public int sub(int a, int b) {
	int c;
	c=a-b;
	System.out.println("Result of sub is: "+c);
	return c;
}
public int mul(int a, int b) {
	int c;
	c=a*b;
	System.out.println("Result of mul is: "+c);
	return c;
}
public int div(int a, int b) {
	int c=a/b;
	System.out.println("Result of div is: "+c);
	return c;
}
public static void main(String[] args) {
	Arithmetic calculation=new Arithmetic();
	System.out.println("Solution of expression (10+2)+2)-2)*2/2) is:  ");
	int sum1=calculation.sum(10,2);
	int sum2=calculation.sum(sum1,2);
	int sub1=calculation.sub(sum2,2);
	int mul1=calculation.mul(sub1,2);
	int div1=calculation.div(mul1,2);
	}}


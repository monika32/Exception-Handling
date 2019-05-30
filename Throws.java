import java.util.*;
public class Throws {
	static void fun1(int j) throws ArithmeticException{
		int i=1/j;
	}
	static void fun2(int j) throws ArrayIndexOutOfBoundsException {
		fun1(j);
		int a[]= {1,2,3,4};
		a[5]=5;
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter number:");
		int j=s.nextInt();
		try {
			System.out.println("in try block");
			Throws.fun2(j);
		} catch(ArithmeticException ae) {
			System.out.println("inside catch block");
			System.out.println(ae);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("inside catch block");
			System.out.println(e);
		}
		System.out.println("program ends");
		
	}

}

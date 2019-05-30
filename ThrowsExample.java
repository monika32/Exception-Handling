import java.util.*;
public class ThrowsExample extends ErrorException  { 
	public ThrowsExample(String s) {
		super(s);
			} 
	public static void method(int age ,int salary) throws  ErrorException {
		if( age > 0 && salary > 0) {
			System.out.println(age + " "+salary);
		} else {
			ErrorException e1=new ErrorException("value cannot be negative");
			//System.out.println(e);
			throw e1;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter age : ");
		int i=s.nextInt();
		System.out.println("enter salary: ");
		int sal=s.nextInt();
		s.close();
		try {
			ThrowsExample.method(i,sal);
		} catch(ErrorException e) {
			System.out.println(e);
		}
	}
}

import java.io.IOException;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//first try
			System.out.println("inside First try");
			try {
				System.out.println("inside child try");
				//int i=9/0;
				try {
					System.out.println("inside child child try");
					int a[]= {1,2,3,4};
					a[6]=0;
				} catch (ArithmeticException e) {
					System.out.println("inside child child try catch");
					System.out.println(e);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inside child try catch");
				System.out.println(e);
			}
		} catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {
			System.out.println("inside First try catch");
			System.out.println(e);
		}
		System.out.println("program ends safley...");
	}

}

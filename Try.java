public class Try {
	public static void main(String[] args) {
		int i=12;
		int j=0;
		int k;
		try {
			System.out.println("try block");
			k=i/j;
		} catch(ArithmeticException e) {
			System.out.println("exception is : "+e);
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("ater exception handled");
	}

}
 
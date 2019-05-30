
public class ParentTry {

	public static void main(String[] args) {
		try {
			System.out.println("parent try");
					try {
						System.out.println("in child 1st try");
						int i=1/0;
					} catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("inside 1st child catch..");
						System.out.println(e);
					}
					try {
						System.out.println("inside child 2nd try");
						int a[]= {1,2,3,4};
						a[5]=9;
					} catch (ArithmeticException e) {
						System.out.println("inside 2nd child catch");
						System.out.println(e);
					}
		} catch (Exception e) {
			System.out.println("inside parent catch");
			System.out.println(e);
		}
	}

}

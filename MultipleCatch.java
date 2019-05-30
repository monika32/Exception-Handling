
public class MultipleCatch {

	public static void main(String[] args) {
		int b=12;
		int j=0;
		int k; 
		int[] a=new int[4];
		try {
			System.out.println("try block");
			k=b/j;
			for(int i=0;i<=4;i++) {
				a[i]=i;
				System.out.println(a[i]);
			}
		}catch(ArithmeticException e) {
			System.out.println("catch block");
			System.out.println("exception is : "+e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block");
			System.out.println("exception is : "+e);
		} finally {
			System.out.println("finally block");
		}
		System.out.println("ater exception handled");
	}

}

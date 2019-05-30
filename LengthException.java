import java.util.Scanner;
public class LengthException extends MyException {
	LengthException(String msg) {
		super(msg);
	}
	void check(String a) throws MyException{
		if((a.length())>15) {
			throw new MyException("'Please enter shorter name'");
		}else 
			System.out.println("valid entry");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string : ");
		String str=s.nextLine();
		s.close();
		try {
			LengthException l=new LengthException(" ");
			l.check(str);
		} catch (MyException e) {
			System.out.println(e);
		}
	}
}


import java.util.Scanner;

public class AgeException extends MyException {
	 AgeException(String msg) {
		super(msg);
	}

	void check(int age) throws MyException{
		if(age<18) {
			throw new MyException("Access denied - You must be at least 18 years old....");
		}else 
			System.out.println("Access verifed");
	}
	
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter age : ");
			int age=s.nextInt();
			s.close();
			try {
				AgeException e=new AgeException(" ");
				e.check(age);
			} catch(Exception e) {
				System.out.println(e);
			}
	}

}

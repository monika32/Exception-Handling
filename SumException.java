import java.util.Scanner;

public class SumException extends MyException{
	
	SumException(String msg) {
		super(msg);
	}
	void check(int a,int b,int c) throws MyException{
		if((a+b+c)>100) {
			throw new MyException("Please enter the numbers, which total is below 100");
		}else 
			System.out.println("sum is :"+(a+b+c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter 3 values : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		s.close();
		try {
			SumException e=new SumException(" ");
			e.check(a,b,c);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}

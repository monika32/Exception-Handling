import java.util.Scanner;

public class CheckNames extends MyException {

	CheckNames(String msg) {
		super(msg);
	}
	public static void check(String str,String[] a) throws MyException {
		int i=0,count=0;
		while(i<a.length) {
			if(a[i].equals(str)) {
				i++;
			    break;
			}i++;
		    count++;
		}
		if(count!=a.length-1) {
			MyException e=new MyException("You are not Enrolled for the class");
			throw e;
		}else
			System.out.println("valid entry");
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size : ");
		int n=s.nextInt();
		System.out.println("enter names :");
		String a[]=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=s.next();
		}
		System.out.println("enter name to check :");
		String str=s.next();
		try  {
		check(str,a);
		} catch(MyException e1) {
			System.out.println(e1);
		}
		s.close();
		
	}

}

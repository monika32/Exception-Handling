import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {

	public static void main(String[] args) {
		BufferedReader b = null;
		try { 
			b = new BufferedReader(new FileReader("/home/mounika/Desktop/Task"));
			System.out.println(b.readLine());
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			System.out.println("finally");
			}
		}
	}

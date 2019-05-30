import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TryNew {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("/home/mounika/Desktop/Task"))) {
			System.out.println(br.readLine());
		} catch (IOException e) { 
			System.out.println(e);
		}
	}
}
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		long startTime = System.currentTimeMillis();
		Scanner scanner = new Scanner(new File("prime.txt"));
		long sum = 0;
		while(scanner.hasNextLine()) {
			sum += Integer.parseInt(scanner.nextLine());
		}
		System.out.print(sum);
		System.out.println(", in " + (System.currentTimeMillis() - startTime) + " ms");
		scanner.close();
	}
}
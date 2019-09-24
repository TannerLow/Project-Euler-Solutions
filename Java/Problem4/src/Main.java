import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> matches = new ArrayList<Integer>();
		boolean found = false;
		for(int j = 999; j >=100; j--){
			for(int i = 999; i >=100; i--){
				int product = i * j;

				int backwards = reverse(product);

				if(product == backwards){
					matches.add(product);
				}
			}
		}
		Collections.sort(matches);
		System.out.println(matches.get(matches.size() - 1) + ", in " + (System.currentTimeMillis() - startTime) + " ms");
	}
	public static int reverse(int product){
		String reverse = new StringBuilder(Integer.toString(product)).reverse().toString();
		return Integer.parseInt(reverse);
	}
}
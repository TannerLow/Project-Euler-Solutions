import java.util.Arrays;

public class Main {
	static long startTime = System.currentTimeMillis();
	static int[] temp = {1,2,3,5,8,13,21,34,55,89};
	static int[] fibArray = Arrays.copyOf(temp, 40);
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int currentTerm = 0;
		while(currentTerm <= 4000000){
			currentTerm = fibonacci(i);
			if(currentTerm % 2 == 0){
				sum += currentTerm;
			}
			i++;
		}
		System.out.println(sum + ", in " + (System.currentTimeMillis() - startTime) + " ms");
	}
	public static int fibonacci(int term){
		if(term == 1){
			return 1;
		}
		else if(term == 2){
			return 2;
		}
		else if(fibArray[term] != 0) {
			return fibArray[term];
		}
		else {
			return fibonacci(term - 1) +fibonacci(term - 2);
		}
	}	
}

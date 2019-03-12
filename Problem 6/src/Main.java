public class Main {
	public static void main(String[] args){
		int n = 100;
		long startTime = System.nanoTime();
		int squaredSum = n * (n + 1) * (2 * n + 1) / 6;
		int sumSquared = (n * (n + 1)) / 2;
		sumSquared *= sumSquared;
		System.out.println(sumSquared - squaredSum + ", in " + (System.nanoTime()-startTime) + " ns");
	}
}
public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int count = 2; //primes: 2,3
		int i = 3; // will get +=2 before checking so i = 3 + 2
		while(count != 10001){
			i += 2;
			if(isPrime(i)){
				count++;
			}
		}
		System.out.println(i + ", in " + (System.currentTimeMillis() - startTime) + " ms");
	}
	public static boolean isPrime(int n) {
		if(n == 1)
			return false;
		if(n < 4) 
			return true;
		if((n & 1) == 0)
			return false;
		if(n < 9)
			return true;
		if(n % 3 == 0)
			return false;
		double max = Math.floor(Math.sqrt(n));
		for(int i = 5; i <= max; i += 6) {
			if(n % i == 0)
				return false;
			if(n % (i + 2) == 0)
				return false;
		}
		return true;
	}
}

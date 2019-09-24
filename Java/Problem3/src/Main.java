public class Main {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		long given = 600851475143L;
		boolean found = false;
		while(!found){
			long factor = smallestFactor(given);
			given /= factor;
			if(isPrime(given)){
				found = true;
				System.out.println(given + ", in " + (System.nanoTime() - startTime) + " ns");
			}
		}
	}
	public static boolean isPrime(long n) {
	    if(n > 2 && (n & 1) == 0)
	       return false;

	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) 
	            return false;
	    return true;
	}
	public static long smallestFactor(long n){
		if(!isPrime(n)){
			for(int i = 2; i<n; i++){
				if(n%i == 0) return i;
			}
		}
		return n;
	}
}
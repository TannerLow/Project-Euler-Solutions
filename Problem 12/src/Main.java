import java.util.ArrayList;

public class Main {
	static ArrayList<Long> divisors = new ArrayList<Long>();
	
	public static void main(String[] args) {
		long sum = 1;
		boolean found = false;
		
		for(int n = 2; !found; n ++){
			divisors.add(1L);
			sum+=n;
			factor(sum);
			if(divisors.size() > 250){
				found = true;
				System.out.println(divisors.get(divisors.size()-1) + ":" + sum);
			}
			divisors.clear();
		}
	}
	public static void factor(long n){
		for(long l = 2; l*l <= n; l++){
			if(n % l == 0){
				divisors.add(l);
			}
		}
	}

}

//sum of 1-500: 125250

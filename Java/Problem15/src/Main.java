
public class Main {

	public static void main(String[] args) {
		System.out.println(choose(40,20));
	}
	static double choose(int a, int b){
		return (factorial(a)/(factorial(b) * factorial(a-b)));
	}
	static double factorial(int a){
		double product = 1;
		for(int i = 1; i<=a; i++){
			product *= i;
		}
		return product;
	}

}

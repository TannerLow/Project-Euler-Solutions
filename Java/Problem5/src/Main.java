
public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int[] factors = {11,12,13,14,15,16,17,18,19,20};
		boolean found = false;
		int start = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19 * 20;
		while(!found){
			for(int i = 0; i < factors.length; i++){
				if(start % factors[i] != 0){
					break;
				}
				if(i == factors.length - 1) {
					found = true;
					System.out.println(start + ", in " + (System.currentTimeMillis() - startTime) + " ms");
				}		
			}
			start+=20;
		}
	}

}
import java.util.ArrayList;

public class Main {
	static int count = 0;
	public static void main(String[] args) {
		int highestCount = 0, highestStart = 1000000;
		
		for(int i = 1000000; i>=3; i--){
			count = 0;
			if((i & (i-1)) != 0){
				int collatzCount = collatzCounter(i);
				if(collatzCount > highestCount){
					highestCount = collatzCount;
					highestStart = i;
				}
			}
		}
		System.out.println(highestStart);
	}
	static int collatzCounter(long l){
		if(l > 1){
			if(l % 2 == 0){
				count++;
				return collatzCounter(l/2);
			}
			else{
				count++;
				return collatzCounter((3*l)+1);
			}
		}
		else{
			return count + 1;
		}
	}
}

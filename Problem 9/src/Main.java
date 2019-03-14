public class Main {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int a = 1; a <999; a++){
			for(int b = 1; b <999; b++){
				for(int c = 1; c <999; c++){
					if(a+b+c == 1000){
						if((a*a)+(b*b) == (c*c)){
							System.out.print(a*b*c);
							System.out.println(", in " + (System.currentTimeMillis() - startTime) + " ms");
							return;
						}
					}
				}
			}
		}
	}
}
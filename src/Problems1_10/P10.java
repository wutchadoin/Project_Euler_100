package Problems1_10;

public class P10 {

	public static void main(String[] args) {
		boolean[] sieve = new boolean[2000000];
		long count = 0;
		for(int i = 2 ; i < sieve.length; i++) {
			if(!sieve[i]) {
				count+=i;
				for(int j = i; j < sieve.length; j+=i) sieve[j] = true;
			}
			
		}
		System.out.println(count);
	}

}

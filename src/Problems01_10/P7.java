package Problems01_10;

public class P7 {

	public static void main(String[] args) {
		boolean[] sieve = new boolean[10000000];
		int count = 0;
		for(int i = 2 ; i < sieve.length; i++) {
			if(!sieve[i]) {
				count++;
				for(int j = i; j < sieve.length; j+=i) sieve[j] = true;
			}
			if(count == 10001) {
				System.out.println(i);
				break;
			}
		}
	}

}

package Problems41_50;
import java.util.*;
public class P46 {
	static Set<Integer> ps = new HashSet<>();
	static List<Integer> pl = new ArrayList<>();
	
	public static void main(String[] args) {
		sieve();
		for(int i = 3; i <= 1000000; i+=2) {
			if(!ps.contains(i)) {
				//check all primes
				boolean b = false;
				for(int j: pl) {
					for(int k = 1; j+2*k*k<=i; k++) {
						if(j+2*k*k==i) {
							b = true;
							break;
						}
					}
					if(b) break;
				}
				if(!b) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	static void sieve() {
		boolean[] b = new boolean[1000000];
		for(int i = 2; i<b.length;i++) {
			if(!b[i]) {
				ps.add(i);
				pl.add(i);
				for(int j = i; j < b.length; j+=i) b[j]=true;
			}
		}
	}
}

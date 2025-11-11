package Problems11_20;
import java.util.*;
public class P12 {
	public static void main(String[] args) {
		List<Integer> s = sieve(10000);
		for(int i = 1; i<=10000000; i++) {
			long num = (i*i+i)/2;
			long prod = 1;
			
			for(int j: s) {
				int count = 0;
				while(num%j==0) {
					num/=j;
					count++;
				}
				prod*=(count+1);
			}
			
			System.out.println(i + " " + prod);
			if(prod>500) {
				System.out.println((i*i+i)/2);
				break;
			}
			
		}
	}
	static List<Integer> sieve(int n){
		boolean[] b = new boolean[n+1];
		List<Integer> l = new ArrayList<>();
		for(int i = 2; i <= n; i++) {
			if(!b[i]) {
				b[i] = true;
				l.add(i);
				for(int j = i; j<=n; j+=i) b[i] = true;
			}
		}
		return l;
	}

}

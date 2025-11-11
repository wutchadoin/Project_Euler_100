package Problems21_30;
import java.util.*;
public class P23 {
	public static void main(String[] args) {
		Set<Integer> l = new HashSet<>();
		for(int i = 2; i<=28123; i++) {
			if(divsum(i)>i) {
				l.add(i);
			}
		}
		long sum = 1;
		for(int i = 2; i <= 28123; i++) {
			boolean b = false;
			for(int j: l) {
				if(l.contains(i-j)) {
					b = true;
					break;
				}
			}
			if(!b) sum+=i;
		}
		System.out.println(sum);
	}
	static int divsum(int n) {
		int sum = 1;
		for(int i = 2; i*i<=n;i++) {
			if(n%i==0) {
				sum+=(n/i);
				if(i*i!=n) sum+=i;
			}
		}
		return sum;
	}
}

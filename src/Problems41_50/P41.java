package Problems41_50;
import java.util.*;
public class P41 {
	//8 and 9 pandigital numbers are not primes. n=8 and n=9 for n(n+1)/2 = 36 and 45 respectively, aka divisible by 3
	public static void main(String[] args) {
		boolean[] b = new boolean[(int)(1e7)];
		List<Integer> l = new ArrayList<>();
		for(int i = 2; i < b.length; i++) {
			if(!b[i]) {
				l.add(i);
				for(int j = i; j<b.length;j+=i) b[j]=true;
			}
		}
		Collections.sort(l,Collections.reverseOrder());
		for(int i = 0; i<l.size();i++) {
			System.out.println(l.get(i));
			boolean[] bb = new boolean[10];
			int c = l.get(i);
			while(c>0) {
				bb[c%10]=true;
				c/=10;
			}
			boolean br = false;
			for(int h = 1; h<=7;h++) {
				if(!bb[h]) {
					br = true;
					break;
				}
			}
			if(!br) {
				System.out.println(l.get(i));
				break;
			}
		}
	
	}
	
}

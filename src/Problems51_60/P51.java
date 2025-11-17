package Problems51_60;
import java.util.*;
public class P51 {
	static Set<Integer> p;
	public static void main(String[] args) {
		sieve();
		for(int i = 5; i <= 7; i++) {
			for(int j = 1; j < 1<<i-1; j++) {
				char[] c = new char[i];
				
			}
		}
	}
	
	static void sieve() {
		boolean[] b = new boolean[1000000];
		for(int i = 2; i<b.length;i++) {
			if(!b[i]) {
				p.add(i);
				for(int j=i;j<b.length;j+=i) b[j]=true;
			}
		}
	}
}

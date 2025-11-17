package Problems51_60;
import java.util.*;
public class P52 {
	static Map<Integer,int[]> map = new HashMap<>();
	public static void main(String[] args) {
		for(int i = 1; i < 10000000; i++) {
			int[] val = toArray(i);
			boolean b = false;
			for(int j = 2; j <= 6; j++) {
				int[] comp = toArray(i*j);
				for(int k = 0; k < 10; k++) {
					if(val[k]!=comp[k]) {
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
	static int[] toArray(int n) {
		if(map.containsKey(n)) return map.get(n);
		int[] a = new int[10];
		
		while(n>0) {
			a[n%10]++;
			n/=10;
		}
		map.put(n,a);
		return a;
	}
}

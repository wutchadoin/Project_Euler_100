package Problems31_40;
import java.util.*;
public class P39 {
	public static void main(String[] args) {
		Map<Integer,Integer> m = new HashMap<>();
		for(int i = 1; i <= 1000; i++) {
			for(int j = i; j<= 1000-i; j++) {
				for(int k = j+1; k <= 1000-i-j; k++) {
					if(i*i+j*j==k*k) {
						m.put(i+j+k, m.getOrDefault(i+j+k,0)+1);
					}
				}
			}
		}
		int max = 0;
		int val = 0;
		for(int i: m.keySet()) {
			if(m.get(i)>max) {
				val = i;
				max = m.get(i);
			}
		}
		System.out.println(val);
	}
}

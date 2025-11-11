package Problems11_20;
import java.util.*;
public class P14 {
	static Map<Long,Integer> m;
	public static void main(String[] args) {
		m = new HashMap<>();
		m.put(1L, 0);
		int min = 0;
		long max = 0;
		for(int i = 2; i<1000000;i++) {
			int cur = dfs(i);
			if(cur>min) {
				min = cur;
				max = i;
			}
		}
		
		System.out.println(max);
	}
	static int dfs(long cur) {
		System.out.println(cur);
		if(m.containsKey(cur)) return m.get(cur);
		int depth = 0;
		if(cur%2==0) {
			depth = 1+dfs(cur/2);
		}
		else depth = 1+dfs(cur*3+1);
		m.put(cur, depth);
		return depth;
	}
}

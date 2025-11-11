package Problems31_40;
import java.util.*;
public class P38 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		for(int i = 2; i < 10; i++) {
			for(int j = 9; j < 100000; j++) {
				StringBuilder s = new StringBuilder();
				Set<Integer> set = new HashSet<>();
				for(int k = 1; k<=i;k++) {
					int val = j*k;
					int v = val;
					while(v>0) {
						set.add(v%10);
						v/=10;
					}
					s.append(val);
				}
				if(s.length()>9) continue;
				System.out.println(s);
				if(set.size()==9&&!set.contains(0)&&s.length()==9) {
					l.add(s.toString());
				}
				
			}
		}
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l.get(0));
	}
}

package Problems21_30;
import java.util.*;
public class P24 {
	static List<String> s;
	static StringBuilder str;
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) {
		s = new ArrayList<>();
		str = new StringBuilder();
		dfs();
		Collections.sort(s);
		System.out.println(s.get(999999));
	}
	static void dfs() {
		if(str.length()==10) {
			s.add(str.toString());
			return;
		}
		for(int i = 0; i <= 9; i++) {
			if(!set.contains(i)) {
				str.append(i);
				set.add(i);
				dfs();
				set.remove(i);
				str.deleteCharAt(str.length()-1);
			}
		}
	}
}

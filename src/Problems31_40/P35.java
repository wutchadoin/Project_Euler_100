package Problems31_40;
import java.util.*;
public class P35 {
	public static void main(String[] args) { //this ones kinda messy
		Set<Integer> s = sieve();
		Set<Integer> circular = new HashSet<>();
		for(int i: s) {
			String cur = Integer.toString(i);
			boolean br = false;
			if(cur.length()==1) {
				circular.add(i);
				continue;
			}
			for(char c: cur.toCharArray()) if((c-'0')%2==0||c=='5') {
				br = true;
				break;
			}
			if(br) continue;
			
			boolean add = true;
			int c = i;
			for(int j = 0; j < cur.length(); j++) {
				if(!s.contains(c)) {
					add = false;
					break;
				}
				//System.out.println(c);
				c = (c/10)+(c%10)*(int)Math.pow(10, cur.length()-1);
				
			}
			if(add) circular.add(i);
			//System.out.println(i);
		}
		System.out.println(circular.size());
	}
	static Set<Integer> sieve(){
		Set<Integer> l = new HashSet<>();
		boolean[] arr = new boolean[1000000];
		for(int i = 2; i < 1000000; i++) {
			if(!arr[i]) {
				l.add(i);
				for(int j = i; j < 1000000; j+=i) {
					//if(i==2) System.out.println(j + " e");
					arr[j] = true;
				}
			}
		}
		return l;
	}
}


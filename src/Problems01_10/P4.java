package Problems01_10;

public class P4 {

	public static void main(String[] args) {
		
		long max = 0;
		for(int i = 100; i <= 999 ;i++) {
			for(int j = 100; j<=999;j++) {
				String cur = Integer.toString(i*j);
				StringBuilder s = new StringBuilder(cur);
				if(cur.equals(s.reverse().toString())) max = Math.max(i*j, max);
			}
		}
		System.out.println(max);
	}

}

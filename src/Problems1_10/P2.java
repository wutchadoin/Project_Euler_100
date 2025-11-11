package Problems1_10;

public class P2 {

	public static void main(String[] args) {
		long sum = 0;
		long prev = 0;
		long cur = 1;
		while(cur<(long)4e6) {
			if((cur&1)==0) sum+=cur;
			long next = cur+prev;
			prev = cur;
			cur = next;
		}
		System.out.println(sum);
	}

}

package Problems21_30;

public class P30 {

	public static void main(String[] args) {
		long sum = 0;
		for(int i = 2; i<=1000000; i++) {
			long s = 0;
			int j = i;
			while(j>0) {
				int d =j%10;
				j/=10;
				s+=d*d*d*d*d;
			}
			if(s==i) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}

package Problems1_10;

public class P3 {

	public static void main(String[] args) {
		long num = 600_851_475_143L;
		long c = 2;
		long max = 0;
		while(num > 1) {
			while(num%c==0) {
				max = c;
				num/=c;
			}
			c++;
		}
		System.out.println(max);
	}

}

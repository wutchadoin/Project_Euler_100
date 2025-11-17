package Problems51_60;
//bigint bruteforce cheesetime
//in another world, do some modular math and binary search for more efficiency
import java.math.*;
public class P53 {

	public static void main(String[] args) {
		BigInteger[] b = new BigInteger[101];
		b[0] = new BigInteger("1");
		for(int i = 1; i < 101; i++) {
			b[i] = b[i-1].multiply(new BigInteger(Integer.toString(i)));
		}
		BigInteger val = new BigInteger("1000000");
		int count = 0;
		for(int i = 23; i <= 100; i++) {
			for(int j = 0; j <= i; j++) {
				BigInteger cur = (b[i].divide(b[j])).divide(b[i-j]);
				if(cur.compareTo(val)>0) count++;
			}
		}
		System.out.println(count);
	}
	
}

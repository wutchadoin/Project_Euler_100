package Problems11_20;
import java.math.*;
public class P20 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("1");
		for(int i = 2; i <= 100; i++) {
			b=b.multiply(new BigInteger(Integer.toString(i)));
			System.out.println(b.toString());
		}
		int dig = 0;
		for(char c: b.toString().toCharArray()) dig+=c-'0';
		System.out.println(dig);
	}
}

package Problems11_20;
import java.math.*;
public class P16 {
	public static void main(String[] args) {
		BigInteger b = new BigInteger("2");
		b = b.pow(1000);
		String s = b.toString();
		int sum = 0;
		for(char c: s.toCharArray()) sum+=c-'0';
		System.out.println(sum);
	}
}

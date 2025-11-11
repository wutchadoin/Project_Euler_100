package Problems21_30;
import java.math.*;
public class P25 {

	public static void main(String[] args) {
		BigInteger z = new BigInteger("1");
		BigInteger o = new BigInteger("1");
		for(int i = 3; true; i++) {
			BigInteger temp = o.add(z);
			z = o;
			o = temp;
			if(o.toString().length()>=1000) {
				System.out.println(i);
				break;
			}
		}
	}

}

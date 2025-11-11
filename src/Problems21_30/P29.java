package Problems21_30;
import java.math.*;
import java.util.*;
public class P29 {

	public static void main(String[] args) {
		Set<BigInteger> s = new HashSet<>();
		for(BigInteger a = new BigInteger("2"); a.compareTo(new BigInteger("100"))<=0; a=a.add(new BigInteger("1"))){
			for(int b = 2; b<=100; b++){
				s.add(a.pow(b));
			}
		}
		System.out.println(s.size());
	}

}

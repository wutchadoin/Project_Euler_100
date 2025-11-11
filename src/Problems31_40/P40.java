package Problems31_40;

public class P40 {
	//not bf
	public static void main(String[] args) {
		System.out.println(bruteforce());
		
		//O(logn)
		long prod = 1;
		for(int i = 1; i <= (1e6); i*=10) {
			//System.out.println(logn(i));
			prod*=logn(i);
		}
		System.out.println(prod);
	}
	
	static long bruteforce() {
		StringBuilder s = new StringBuilder();
		for(int i = 1; i <= 1000000; i++) {
			s.append(i);
		}
		long prod = 1;
		for(int i = 1; i<=1000000;i*=10) {
			prod*=(s.charAt(i-1)-'0');
		}
		return prod;
		
	}
	static long logn(int a) {
		int n = a;
		int sub = 1;
		while(n>sub*9*Math.pow(10, sub-1)) {
			n-=sub*9*Math.pow(10, sub-1);
			sub++;
		}
		n--;
		String value = Integer.toString((int)Math.pow(10, sub-1)+n/sub);
		int digit = n%sub;
		//System.out.println(n +" " + digit + " " + sub);
		return value.charAt(digit)-'0';
	}
}

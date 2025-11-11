package Problems11_20;
public class P17 {
	public static void main(String[] args) {
		
		int s2 = 0;
		for(int i = 1; i <= 1000; i++) {
			s2+=word(i).length();
		}
		System.out.println(s2);
		
	}
	
	static String word(int n) {
		String[] num = new String[] {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] teens = new String[] {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tens = new String[] {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		if(n==1000) return "OneThousand";
		StringBuilder s = new StringBuilder();
		if(n>=100) {
			s.append(num[n/100]+"Hundred");
			if(n%100!=0) s.append("And");
			n%=100;
		}
		if(n>=20) {
			s.append(tens[n/10]);
			n%=10;
		}
		if(n>=10) {
			s.append(teens[n%10]);
			n=0;
		}
		if(n>0) s.append(num[n]);
		
		
		return s.toString();
	}
}

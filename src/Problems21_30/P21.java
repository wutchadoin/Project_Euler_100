package Problems21_30;
public class P21 {
	public static void main(String[] args){
		//Set<Integer> s = new HashSet<>();
		int ret = 0;
		for(int i = 1; i<10000; i++) {
			
			int sum = sumDiv(i);
			int sumsum = sumDiv(sum);
			if(sumsum==i && sum!=i) {
				ret+=i;
			}
			if(i==sumsum) System.out.println(i + " " + sum + " " + sumsum);
			
		}
		System.out.println(ret);
	}
	static int sumDiv(int n) {
		int sum = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n%i==0) sum+=i;
		}
		return sum;
	}
}

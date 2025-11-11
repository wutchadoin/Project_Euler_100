package Problems31_40;
import java.math.BigInteger;

public class P31 {
	public static void main(String[] args) {
		//basic coin change dp
		BigInteger[] dp = new BigInteger[201];
		int[] coins = new int[] {1,2,5,10,20,50,100,200};
		dp[0]=new BigInteger("1");
		for(int i = 1; i<=200 ;i++) dp[i] = new BigInteger("0");
		for(int j: coins) {
			for(int i = 0; i <= 200-j; i++) {
				if(i+j<=200) dp[i+j]=dp[i+j].add(dp[i]);
			}
		}
		System.out.println(dp[200]);
	}
}

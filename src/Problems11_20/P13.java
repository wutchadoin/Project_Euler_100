package Problems11_20;
import java.io.*;
public class P13 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sum = new int[61];
		for(int i = 0; i < 100; i++) {
			String s = in.readLine();
			for(int j = 0; j < 50; j++) {
				sum[10+j]+=s.charAt(j)-'0';
			}
		}
		for(int j = 60; j>0; j--) {
			sum[j-1]+=sum[j]/10;
			sum[j]%=10;
		}
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < 60; i++) {
			if(sum[i]!=0) {
				
				for(int j = i; j < i+10; j++) {
					s.append(sum[j]);
				}
				break;
			}
		}
		System.out.println(s);
	}

}

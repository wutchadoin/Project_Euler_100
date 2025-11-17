package Problems81_90;
import java.io.*;
public class P81 {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long[][] l = new long[80][80];
		for(int i = 0; i < 80; i++) {
			String[] a = in.readLine().split(",");
			for(int j = 0; j < 80; j++) {
				l[i][j] = Long.parseLong(a[j]);
				long min = Integer.MAX_VALUE;
				if(i>0) min = l[i-1][j];
				if(j>0) min = Math.min(l[i][j-1],min);
				if(min!=Integer.MAX_VALUE) l[i][j]+=min;
			}
			
		}
		System.out.println(l[79][79]);
	}
}

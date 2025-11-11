package Problems11_20;
import java.util.*;
import java.io.*;
public class P11 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long[][] a = new long[20][20];
		for(int i = 0; i < 20; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			for(int j = 0; j < 20; j++) {
				a[i][j] = Integer.parseInt(f.nextToken());
			}
		}
		long max = 0;
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if(i+3<20) {
					max = Math.max(max, a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j]);
				}
				if(j+3<20) {
					max = Math.max(max, a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3]);
				}
				if(i+3 < 20 && j+3<20) {
					max = Math.max(max, a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3]);
				}
				if(j>3&&i+3<20) {
					max = Math.max(max, a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3]);
				}
			}
		}
		for(int i = 0; i < 20; i++) {
			System.out.println();
			for(int j = 0; j < 20; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println(max);
	}

}

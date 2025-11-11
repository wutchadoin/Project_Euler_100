package Problems11_20;
import java.util.*;
import java.io.*;
public class P18 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] row = new int[15][15];
		for(int i = 0; i < 15; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			for(int j = 0; j < i+1; j++) {
				row[i][j] = Integer.parseInt(f.nextToken());
				int max = 0;
				if(i>0) max = row[i-1][j];
				if(i>0&&j>0) max = Math.max(row[i-1][j-1], max);
				row[i][j]+=max;
			}
			
		}
		int max = 0;
		for(int i = 0; i < 15; i++) max = Math.max(max, row[14][i]);
		System.out.println(max);
	}

}

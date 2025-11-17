package Problems81_90;
import java.util.*;
import java.io.*;
public class P82 {
	//dijkstras but u cant go left
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long[][] l = new long[80][80];
		long[][] v = new long[80][80];
		
		for(int i = 0; i < 80; i++) {
			String[] a = in.readLine().split(",");
			for(int j = 0; j < 80; j++) {
				l[i][j] = Long.parseLong(a[j]);
				v[i][j] = Integer.MAX_VALUE;
			}
		}
		
		PriorityQueue<long[]> pq = new PriorityQueue<>((a,b)->Long.compare(a[2], b[2]));
		for(int i = 0; i < 80; i++) pq.add(new long[] {i,0,l[i][0]});
		while(!pq.isEmpty()) {
			long[] cur = pq.poll();
			int r = (int)cur[0];
			int c = (int)cur[1];
			long val = cur[2];
			if(v[r][c] != Integer.MAX_VALUE) continue;
			v[r][c] = val;
			if(c==79) {
				System.out.println(val);
				break;
			}
			if(r > 0 && v[r-1][c]==Integer.MAX_VALUE) pq.add(new long[] {r-1,c,val+l[r-1][c]});
			//if(c > 0 && v[r][c-1]==Integer.MAX_VALUE) pq.add(new long[] {r,c-1,val+l[r][c-1]});
			if(r < 79 && v[r+1][c]==Integer.MAX_VALUE) pq.add(new long[] {r+1,c,val+l[r+1][c]});
			if(c < 79 && v[r][c+1]==Integer.MAX_VALUE) pq.add(new long[] {r,c+1,val+l[r][c+1]});
		}
		//System.out.println(v[79][79]);
		
	}
}

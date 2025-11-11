package Problems21_30;

public class P28 {
	public static void main(String[] args) {
		int[][] a = new int[1001][1001];
		
		int r = 500;
		int c = 500;
		int d = 0;
		//rdlu
		int rB = 501;
		int dB = 501;
		int lB = 499;
		int uB = 499;
		
		int count = 1;
		while(r < 1001 && c < 1001) {
			a[r][c] = count;
			count++;
			if(d==0) {
				c++;
				if(c==rB) {
					d++;
					rB++;
				}
			}else if(d==1) {
				r++;
				if(r==dB) {
					d++;
					dB++;
				}
			}else if(d==2) {
				c--;
				if(c==lB) {
					d++;
					lB--;
				}
			}else {
				r--;
				if(r==uB) {
					d=0;
					uB--;
				}
			}
		}

		long sum = 0;
		for(int i = 0; i < 1001; i++) {
			sum+=a[i][i];
			sum+=a[1001-i-1][i];
		}
		sum-=a[500][500];
		System.out.println(sum);
		
	}
}

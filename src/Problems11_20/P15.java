package Problems11_20;

public class P15 {
	public static void main(String[] args) {
		long[][] a = new long[21][21];
		a[0][0] = 1;
		for(int i = 0; i < a.length;i ++) {
			for(int j = 0; j < a.length; j++) {
				if(i>0) a[i][j] += a[i-1][j];
				if(j>0) a[i][j] += a[i][j-1];
			}
		}
		System.out.println(a[20][20]);
	}
}

package Problems1_10;

public class P9 {
	public static void main(String[] args) {
		for(int i = 1; i <= 1000; i++) {
			for(int j = i+1; j<=1000;j++) {
				for(int k = j+1; k <= 1000-i-j; k++) {
					if(i*i+j*j==k*k && i+j+k==1000) {
						System.out.println(i*j*k);
						
					}
				}
			}
		}
	}
}

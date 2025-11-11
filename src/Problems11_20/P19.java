package Problems11_20;
import java.util.*;

public class P19 {

	public static void main(String[] args){
		Set<Integer> thirty = new HashSet<>();
		thirty.add(9);
		thirty.add(4);
		thirty.add(6);
		thirty.add(11);
		
		int wday = 1;
		int yr = 1900;
		int month = 1;
		int c = 0;
		while(yr < 2001) {
			while(month <= 12) {
				if(month==2) {
					if(yr%4==0) {
						for(int i = 1; i<= 29; i++) {
							wday++;
							if(wday==8) wday=1;
							if(wday==1 && i==1 && yr > 1900) c++;
						}
					}else {
						for(int i = 1; i<= 28; i++) {
							wday++;
							if(wday==8) wday=1;
							if(wday==1 && i==1 && yr > 1900) c++;
						}
					}
				}else if(thirty.contains(month)) {
					for(int i = 1; i<= 30; i++) {
						wday++;
						if(wday==8) wday=1;
						if(wday==1 && i==1 && yr > 1900) c++;
					}
				}else {
					for(int i = 1; i<= 31; i++) {
						wday++;
						if(wday==8) wday=1;
						if(wday==1 && i==1 && yr > 1900) c++;
					}
				}
				month++;
			}
			yr++;
			month=1;
			
		}
		System.out.println(c);
	}

}

package rk.test.java.pojo.business;

import java.util.Random;

public class Policy {
	
	public int getPolicy(){
		/* returns number between 1 to 6 */
		Random r = new Random();
		int Low = 1;
		int High = 7;
		int x = r.nextInt(High-Low) + Low;	
		return x;
	}

}

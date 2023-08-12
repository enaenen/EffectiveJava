package test.item59;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerater {
	static Random rnd = new Random();
	static ThreadLocalRandom rnd2 = ThreadLocalRandom.current();
	static int random(int n) {
		return rnd.nextInt(n);
//		return Math.abs(rnd.nextInt()) % n;
	}
	static int randomVersion2(int n){
		return rnd2.nextInt(n);
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low = 0;
		for(int i = 0; i < 1000000; i++) {
			if (random(n) < n/2)
				low++;
		}
		System.out.println(low);
		long end = System.currentTimeMillis();
		System.out.println("time = " + (end - start));

		start = System.currentTimeMillis();
		low = 0;
		for(int i = 0; i < 1000000; i++) {
			if (randomVersion2(n) < n/2)
				low++;
		}
		System.out.println(low);
		end = System.currentTimeMillis();
		System.out.println("time = " + (end - start));
	}
}

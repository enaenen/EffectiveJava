package test.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class UsefulParallel {

	static long pi(long n) {
		return LongStream.rangeClosed(2, n)
				.mapToObj(BigInteger::valueOf)
				.filter(i -> i.isProbablePrime(50))
				.count();
	}

	static long piWithParallel(long n) {
		return LongStream.rangeClosed(2, n)
				.mapToObj(BigInteger::valueOf)
				.filter(i -> i.isProbablePrime(50))
				.count();
	}

	public static void main(String[] args) {
		long s = 0, e = 0;
		s = System.currentTimeMillis();
		pi(1000L);
		e = System.currentTimeMillis();
		System.out.println("time = " + (e - s));

		System.out.println("=================================");
		s = System.currentTimeMillis();
		piWithParallel(1000L);
		e = System.currentTimeMillis();
		System.out.println("time = " + (e - s));
	}
}

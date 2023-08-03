package test.item48;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeMaker {

	public static void main(String[] args) {
//		primes().limit(10).forEach(System.out::println);

		primes()
//				.parallel()
				.map(p -> TWO.pow(p.intValueExact()).subtract(ONE)) // 2^p - 1
				.filter(mersenne -> mersenne.isProbablePrime(50))
				.limit(20)
				.forEachOrdered(System.out::println);
	}
	static Stream<BigInteger> primes() { // 2 이후의 소수 iterate
		return Stream.iterate(TWO, BigInteger::nextProbablePrime);
	}

}

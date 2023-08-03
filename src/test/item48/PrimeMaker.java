package test.item48;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;

import java.math.BigInteger;
import java.util.stream.Stream;

public class PrimeMaker {

	public static void main(String[] args) {
		primes()
//				.parallel()
				.map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
				.filter(mersenne -> mersenne.isProbablePrime(50))
				.limit(20)
				.forEach(System.out::println);
	}
	static Stream<BigInteger> primes() {
		return Stream.iterate(TWO, BigInteger::nextProbablePrime);
	}

}

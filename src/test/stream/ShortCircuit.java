package test.stream;

import java.util.stream.IntStream;

public class ShortCircuit {

	public static void main(String[] args) {
		IntStream.range(0, 10_000_000)
				.limit(5)
				.map(i -> i + 100)
				.forEach(i -> System.out.println("result = " + i));
	}

}

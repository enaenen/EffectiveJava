package test.item48;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyTestParallel {

	static void printing(int a){
		System.out.print(a + " ");
	}
	static int add(int a){
		return a + 1;
	}
	public static void main(String[] args) {
		long start =0, end = 0;
		BigInteger b = BigInteger.TWO;
		;
		System.out.println(b.nextProbablePrime());
		System.out.println();


		start = System.currentTimeMillis();
		Stream.iterate(1, MyTestParallel::add)
				.parallel()
				.limit(10)
				.forEach(System.out::println);
//				.forEachOrdered(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("after = " + (end - start));
		System.out.println("====================================");

		start = System.currentTimeMillis();
		Stream.iterate(1, MyTestParallel::add)
				.limit(10)
				.forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("after = " + (end - start));

		/*
		IntStream.range(1, 100).limit(20).forEach(MyTestParallel::printing);
		System.out.println("\n===================");
		IntStream.range(1, 100).parallel().limit(20).forEach(MyTestParallel::printing);

		 */
	}

}

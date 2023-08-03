package test.stream;

import java.util.stream.IntStream;

public class Disadvantage {

	public static void main(String[] args) {
		IntStream.iterate(0, i->(i+1)%2)
				.limit(10)
				.distinct()
				.forEach(System.out::println);
		System.out.println("complete");

		// 무한루프
		// distinct 에서 0,1 이 반복적으로 나오므로 다음으로 넘겨주지 않아서 limit 10 이 달성되지 않는다.1
//		IntStream.iterate(0, i->(i+1)%2)
//				.distinct()
//				.limit(10)
//				.forEach(System.out::println);
//		System.out.println("complete");
	}

}

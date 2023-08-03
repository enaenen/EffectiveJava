package test.stream;

import java.util.List;
import java.util.stream.Stream;

public class Consumption {

	public static void main(String[] args) {
		List<String> list = List.of("chae", "lee", "park", "choi", "an");
		Stream<String> stream = list.stream();

		recycle(stream);
		System.out.println("-- complete ! --");
		recycle(stream);
	}

	public static void recycle(Stream<String> stream) {
		stream.forEach(str -> System.out.println("consuming = " + str));
	}
}

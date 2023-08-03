package test.stream;

import java.util.List;

public class LoopFusion {

	public static void main(String[] args) {
		loopFusion();
	}
	public static void loopFusion() {
		List<String> names = List.of("chae", "lee", "an", "choi","park");
		names.stream()
				.filter(str -> {
					System.out.println("first filter = " + str);
					return str.length() > 3;
				})
				.filter(str -> {
					System.out.println("second filter = " + str);
					return !str.contains("chae");
				})
				.map(str -> {
					System.out.println("map = " + str);
					return str.toUpperCase();
				})
				.forEach(str -> {
					System.out.println("forEach = " + str + "\n");
				});
	}


}

package test;


import java.util.EnumSet;

public class EnumSetExample {
	enum Color { RED, BLUE, GREEN}

	public static void main(String[] args) {
		EnumSet<Color> smallSet = EnumSet.of(Color.RED, Color.BLUE); // RegularEnumSet 반환
		EnumSet<Color> largeSet = EnumSet.allOf(Color.class); // RegularEnumSet 반환

		System.out.println(smallSet.getClass().getSimpleName()); // RegularEnumSet 출력
		System.out.println(largeSet.getClass().getSimpleName()); // RegularEnumSet 출력
	}
}

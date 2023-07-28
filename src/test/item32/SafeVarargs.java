package test.item32;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SafeVarargs {

	public static <T> List<T> pickTwo(T a, T b, T c){
		switch (ThreadLocalRandom.current().nextInt(3)){
			case 0: return List.of(a,b);
			case 1: return List.of(a,c);
			case 2: return List.of(b,c);
		}
		throw new AssertionError();
	}

	public static void main(String[] args) {
		List<String> attributes = pickTwo("아이패드","아이폰","맥북");
		for (String attribute : attributes) {
			System.out.println(attribute);
		}
	}

}

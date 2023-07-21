package test.generic.genericmethod;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

	public static void printing(List<Object> list){
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println();
	}

	public static void printingWithWild(List<?> list){
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Object> objectList = new ArrayList<>();
		objectList.add("a");
		objectList.add("b");
		objectList.add("c");
		printing(objectList);

		List<String> stringList = new ArrayList<String>();
		stringList.add("x");
		stringList.add("y");
		stringList.add("z");
		printingWithWild(stringList);
	}
}

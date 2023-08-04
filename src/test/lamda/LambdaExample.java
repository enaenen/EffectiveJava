package test.lamda;

import static java.util.Comparator.comparingInt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
	static void printing(String s){
		System.out.print(s + " ");
	}
	public static void main(String[] args) {
		List<String> immutable = List.of("ABC", "KDKFDKFKEFKE", "EFG", "ZZZ", "AAAA");

		List<String> list = new ArrayList<>();
		list.add("ABC");
		list.add("KDKFDKFKEFKE");
		list.add("EFG");
		list.add("ZZZ");
		list.add("AAAA");

		List<String> tmp = list.stream().collect(Collectors.toList());


		//최초형태
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		});

		//중간형태
		Collections.sort(list, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
		//최종형태
		Collections.sort(tmp, comparingInt(String::length));
		list.stream().forEach(LambdaExample::printing);
		System.out.println();
		tmp.stream().forEach(LambdaExample::printing);
		System.out.println();


	}
}

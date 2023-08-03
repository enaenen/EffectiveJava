package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Advantage {

	public static void main(String[] args) {
		List<String> init = List.of("abc", "ABBA","zzzzzzzzzzz", "XXXxXx","abc ccccccccccccc");
		List<String> res = forLoopVersion(init);

		for (String re : res) {
			System.out.println(re);
		}
		System.out.println();
		res = streamVersion(init);

		for (String re : res) {
			System.out.println(re);
		}
	}
	public static List<String> forLoopVersion(List<String> list){
		List<String> result = new ArrayList<>();
		for (String str : list){
			if (str.length() < 10){
				str = str.toLowerCase();
				if (!str.contains("abc")){
					result.add(str);
				}
			}
		}
		return result;
	}
	public static List<String> streamVersion(List<String> list) {
		return list.stream()
				.filter(str -> str.length() < 10)
				.map(String::toLowerCase)
				.filter(str -> !str.contains("abc"))
				.collect(Collectors.toList());
	}
	public static List<String> streamVersionWithParallel(List<String> list) {
		return list.stream()
				.parallel()
				.filter(str -> str.length() < 10)
				.map(String::toLowerCase)
				.filter(str -> !str.contains("abc"))
				.collect(Collectors.toList());
	}

}

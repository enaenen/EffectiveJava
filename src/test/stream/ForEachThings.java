package test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForEachThings {

	public static void main(String[] args) {

	}
	public static List<String> discouragedVersion(Stream<String> stream, Pattern pattern){
		List<String> results = new ArrayList<>();
		stream.filter(s -> pattern.matcher(s).matches())
				.forEach(results::add); //불필요한 부수효과
		return results;
	}

	public static List<String> discouragedVersionWithParallel(Stream<String> stream, Pattern pattern){
		List<String> results = new ArrayList<>();
		stream.parallel()
				.filter(s -> pattern.matcher(s).matches())
				.forEach(results::add); // 병렬수행 -> 항상 결과값이 같지 않을 수 있다.
		return results;
	}

	public static List<String> encouragedVersion(Stream<String> stream, Pattern pattern){
		return stream.filter(s -> pattern.matcher(s).matches())
				.collect(Collectors.toList()); // no side-effects
	}

}

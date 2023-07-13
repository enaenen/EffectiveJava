package test.item11;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EqualsOverriding {

	public void patternTest(){
		String text = "Hello, my name is John. I live in New York.";
		String patternString = "name is (\\w+)";

		// 패턴 객체 생성
		Pattern pattern1 = Pattern.compile(patternString);
		Pattern pattern2 = Pattern.compile(patternString);

		// 텍스트와 패턴 매칭
		Matcher matcher = pattern1.matcher(text);

		// 매칭된 결과 찾기
		if (matcher.find()) {
			String result = matcher.group(1);
			System.out.println("매칭된 결과: " + result);
		} else {
			System.out.println("매칭된 결과 없음");
		}

		System.out.println("pattern1.equals(pattern2) = " + pattern1.equals(pattern2));
		System.out.println("pattern1's value == pattern2's value " + pattern1.toString().equals(pattern1.toString()));
	}

	public static void main(String[] args) {
//		Object obj = new Object();
//		Thread thread = new Thread();
//		thread.equals(obj);
//
//		Pattern pattern = Pattern.compile(".*");
//		pattern.equals(obj);

		new EqualsOverriding().patternTest();
		AbstractMap<String, String> map = new HashMap<String, String>();
		Set<String> set = new HashMap<String, String>().keySet();
	}

}

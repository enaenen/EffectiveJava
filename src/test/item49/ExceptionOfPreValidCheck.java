package test.item49;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ExceptionOfPreValidCheck {

	public static void main(String[] args) {
		List list = new ArrayList<>(); // 테스트를 위해 RAW 타입 사용
		list.add(10);
		list.add(1);
		list.add("S"); // 잘못된 타입
		list.add(8);
		list.add(3);

//		for (Object o : list) {
//			if (!Integer.TYPE.isInstance(o))
//				throw new ClassCastException("Not int type");
//		}
		Collections.sort(list);
		list.stream().forEach(System.out::println);
	}

}

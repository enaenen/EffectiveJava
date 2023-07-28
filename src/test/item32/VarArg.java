package test.item32;

import java.util.List;

public class VarArg {

	static void dangerous(List<String>... stringLists){
		List<Integer> intList = List.of(42);

		Object[] objects = stringLists;
		objects[0] = intList; // 힙 오염 발생
		//objects[0] == List<Integer> intList 의 참조를 가진다.
//		System.out.println(objects[0].getClass());

		String s = stringLists[0].get(0); // class cast exception
		System.out.println(s);
	}
	public static void main(String[] args) {
		dangerous(List.of("a", "b","c"));
	}

}

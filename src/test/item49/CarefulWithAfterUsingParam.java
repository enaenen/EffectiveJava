package test.item49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CarefulWithAfterUsingParam {
	public static List<Integer> createListView(int[] array) {
		Objects.requireNonNull(array, "array is NULL");
		List<Integer> result = new ArrayList<>();
		for (int i : array) {
			result.add(i);
		}
		return result;
	}


	public static List<Integer> createListViewNoValidate(int[] array) {
		List<Integer> result = new ArrayList<>();
		for (int i : array) {
			result.add(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int[] intArray = null;
//		List<Integer> listView = createListView(intArray);
		List<Integer> listView = createListViewNoValidate(intArray);
		System.out.println(listView);
	}

}

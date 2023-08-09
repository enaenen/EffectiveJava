package test.item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import test.item58.UseForEach.Card;
import test.item58.UseForEach.Suit;
import test.item58.UseForEach.Rank;

public class UseForEachNegative {

	private static void destructiveFiltering(List<Integer> numbers) {
//		for (Integer number : numbers) {
//			if (number % 2 == 0 )
//				numbers.remove(number);
//		}



		/*
		for (Iterator<Integer> i = numbers.iterator(); i.hasNext();) {
			Integer number = i.next();
			if (number % 2 == 0)
				i.remove();
		}
		*/

		numbers.removeIf(i -> i % 2 == 0);
		numbers.stream().forEach(System.out::print);
	}

	private static void transforming() {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");

		for (ListIterator<String> i = fruits.listIterator(); i.hasNext(); ) {
			i.set(i.next() + "s");
		}

		for (String fruit : fruits) {
			fruit += "s";
		}

//		ListIterator<String> iterator = fruits.listIterator();
//		while (iterator.hasNext()) {
//			String fruit = iterator.next();
//			// 원소 값 수정 예시: 각 원소의 끝에 "s"를 추가
//			iterator.set(fruit + "s");
//		}

		// 수정된 결과 출력
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

	private static void parallelForEach() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		// 이전 요소에 의존하는 처리
		int previousValue = 0;
		for (int number : numbers) {
			int newValue = number + previousValue;
			System.out.println("Number: " + number + " | New Value: " + newValue);
			previousValue = newValue;
		}
	}
	private static void parallelForEachThread(){
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		Runnable task = () -> {
			for (int i = 0; i < numbers.size(); i++) {
				int newValue = numbers.get(i) * 2;
				numbers.set(i, newValue);
				System.out.println("Thread " + Thread.currentThread().getId() +
						" | Element at index " + i + " updated to " + newValue);
			}
		};

		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		thread1.start();
		thread2.start();
	}

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		destructiveFiltering(numbers);
		System.out.println();
		transforming();
		parallelForEach();
		parallelForEachThread();


	}

}

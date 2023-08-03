package test.item48;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample {
	static void timeDiff(){
		long start = 0;
		long end = 0;

		start=System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::print);
		System.out.println();
		end = System.currentTimeMillis();
		System.out.println("Time = " + (end-start));

		System.out.println("=========================================");

		start=System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::print);
		System.out.println();
		end = System.currentTimeMillis();
		System.out.println("Parallel Time = " + (end-start));

	}
	static void threadCheck(){
		IntStream.range(1, 10).forEach(x -> System.out.println("Thread : " +Thread.currentThread().getName() + " : " + x));
		System.out.println("===========================================");
		IntStream.range(1, 10).parallel().forEach(x -> System.out.println("Thread : " +Thread.currentThread().getName() + " : " + x));

	}
	static void userEntityDiff(){
		long start =0, end = 0;
		List<User> userData = UserRespository.getUserData();
		start = System.currentTimeMillis();
		double averageEXP1 = userData
				.stream()
				.map(User::getExp)
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println(averageEXP1);
		System.out.println("NORMAL TIME = " + (end - start));

		System.out.println("========================================");

		start = System.currentTimeMillis();
		double averageEXP2 = userData
				.stream()
				.parallel()
				.map(User::getExp)
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		end = System.currentTimeMillis();
		System.out.println(averageEXP2);
		System.out.println("Parallel TIME = " + (end - start));

	}

	public static void main(String[] args) {
		// 시간 비교
		timeDiff();
		// 스레드 비교
		threadCheck();
		// Entity 비교
		userEntityDiff();
	}

}

package test.item19;

class AddSuper {

	public int addAll(int... numList) {
		int result = 0;
		for (int num : numList) {
			result += add(result, num);
		}
		return result;
	}

	public int add(int a, int b) {
		return a + b;
	}

	private int myAdd(int a, int b) {
		return a + b;
	}

}

class Jasik extends AddSuper {

	@Override
	public int add(int a, int b) {
		return a * b;
	}
}

public class MakePrivate {

	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		int i = jasik.addAll(1, 2, 3, 4, 5);
		System.out.println("i = " + i);
	}

}

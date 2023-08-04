package test.item49;

public class PrivateMethodValidate {

	private static void sort(long a[], int offset, int length) {
		assert a != null;
		assert offset >= 0 && offset <= a.length;
		assert length >= 0 && length <= a.length - offset;
	}

	public static void main(String[] args) {
		sort(null, 0, 0);
		sort(null, 10, 10);
	}

}

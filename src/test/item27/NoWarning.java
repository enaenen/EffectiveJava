package test.item27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NoWarning {

	private void foo(Object object) {
		if (object instanceof Collection) {
			/**
			 * I know this is a Collection<Object> because that is the
			 * only type that can get to this block. If I cast to
			 * Collection<Object> there will be a warning. If I cast to
			 * Collection<?> the warning goes away but then the
			 * wrong version of bar() gets called
			 */
//			@SuppressWarnings("unchecked")
//			Collection<Object> coll = (Collection<Object>) object;
			Collection<?> coll = (Collection<?>) object;
			bar(coll);
		}
	}

	// called when param is Collection<Object>
	private void bar(Collection<Object> object) {
		System.out.println("Collection<Object>");
	}

	// called when the param is Collection<?>
	private void bar(Object object) {
		System.out.println("object");

	}

	@SuppressWarnings({"rawtypes", "unchecked"})
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("Hello");
		list.add("World");

		///
		NoWarning thisClass = new NoWarning();
		Collection collection = list;

		thisClass.foo(collection);
		ArrayList<Integer> integers = new ArrayList<>();
		thisClass.foo(integers);
	}
}

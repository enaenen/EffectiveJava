package test.singletons;

import java.lang.reflect.AccessibleObject;
import java.util.function.Supplier;

public class Unity {
	private static final Unity NORTHANDSOUTH = new Unity();

	public static Unity getInstance() {
		return NORTHANDSOUTH;
	}

	public static void main(String[] args) {
		Supplier<Unity> supplier = Unity::getInstance;
		Unity unity = supplier.get();
	}


}

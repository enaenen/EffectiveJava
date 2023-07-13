package test.item19;

import java.time.Instant;

class Super {
	public Super() {
		overrideMe();
	}
	public void overrideMe() {
	}
}

final class Sub extends Super {
	private final String name;

	Sub(){
		name = "ANONYMOUS";
	}

	@Override
	public void overrideMe() {
		System.out.println("name = " + name);
	}
}
public class OverrideExtend {

	public static void main(String[] args) {
		Sub sub = new Sub();
		Super subSuper = new Sub();
		sub.overrideMe();
	}
}

package test.item26;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static <T> void genericAdder(T e, T e2){
		System.out.println(e.toString()+ " " + e2.toString());
	}
	public static void main(String[] args) {
		genericAdder(1, 2);
		genericAdder("A","B");
		genericAdder(1.0,2.0);
		Collection a = new ArrayList();
		a.add("a");
		a.add("b");
		for (Object o : a) {
			Integer next = (Integer) o;
			next.toString();
		}
	}
}

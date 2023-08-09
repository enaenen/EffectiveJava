package test.item57;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.print.DocFlavor.STRING;

public class LocalVariableInRepeat {

	public static void main(String[] args) {
		List<String> list = List.of("a","b", "c", "d", "e", "f", "g", "h", "i");
		List<String> list2 = List.of("z","y", "x", "w", "v", "u", "t", "s", "r");

		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
			System.out.println("next = " + iter.next());
		Iterator<String> i2 = list2.iterator();
		while (iter.hasNext())
			System.out.println("next = " + i2.next());




		for(Iterator<String> x = list.iterator(); x.hasNext();) {
			String next = x.next();
			System.out.println("next = " + next);
		}
		for (String s : list) {
			System.out.println("next = " + s);
		}

		List<Integer> numList = new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9,10));

		for(int idx = 0; idx < numList.size(); idx++) {
			if (idx % 2 == 0)
				numList.set(idx, 0);
		}
		numList.stream().forEach(System.out::println);


		for(int i =0, n = numList.size(); i < n; i++) {
			if (i % 2 == 0)
				numList.set(i, 0);
		}
	}

}

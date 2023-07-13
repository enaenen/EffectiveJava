package test.item18;

import java.util.HashSet;
import java.util.List;

public class InstrumentHashSetExample {
	public class InstrumentedHashSet<E> extends HashSet<E> {
		// 추가된 원소의 수
		private int addCount = 0;

		public InstrumentedHashSet() {

		}

		public InstrumentedHashSet(int initCap, float loadFactor) {
			super(initCap, loadFactor);
		}

		@Override
		public boolean add(E e) {
			addCount++;
			return super.add(e);
		}

		@Override
		public boolean addAll(java.util.Collection<? extends E> c) {
			addCount += c.size();
			return super.addAll(c);
		}

		public int getAddCount() {
			return addCount;
		}
	}

	public static void main(String[] args) {
		InstrumentHashSetExample example = new InstrumentHashSetExample();
		InstrumentedHashSet<String> s = example.new InstrumentedHashSet<String>();
//		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		s.addAll(List.of("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}

}

package test.item12;

import java.util.Arrays;
import java.util.EmptyStackException;

public class CloneTest {

	static class Stack {

		private Object[] elements;
		private int size = 0;
		private static final int DEFAULTINITIALCAPACITY = 16;

		public Stack() {
			this.elements = new Object[DEFAULTINITIALCAPACITY];
		}

		public void push(Object e) {
			ensureCapacity();
			elements[size++] = e;
		}

		public Object pop() {
			if (size == 0) {
				throw new EmptyStackException();
			}
			Object result = elements[--size];
			elements[size] = null; //다쓴참조해제
			return result;
		}

		// 원소를 위한 공간을 적어도 하나 이상 합보한다.
		private void ensureCapacity() {
			if (elements.length == size) {
				elements = Arrays.copyOf(elements, 2 * size + 1);
			}
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			try {
				Stack result = (Stack) super.clone();
				result.elements = elements.clone();
				return result;
			} catch (CloneNotSupportedException e) {
				throw new AssertionError();
			}
		}
	}

}

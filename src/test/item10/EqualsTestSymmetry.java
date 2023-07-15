package test.item10;

import java.util.Objects;

public class EqualsTestSymmetry {

	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("PolIsh");
		String s = "polish";
		System.out.println("cis.equals(s) = " + cis.equals(s));
		System.out.println("s.equals(cis) = " + s.equals(cis));
	}

	//대칭성 실패
	static final class CaseInsensitiveString {

		private final String s;

		public CaseInsensitiveString(String s) {
			this.s = Objects.requireNonNull(s);
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof CaseInsensitiveString) {
				return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
			}
			if (o instanceof String) {
				return s.equalsIgnoreCase((String) o);
			}
			return false;
		}
	}

}

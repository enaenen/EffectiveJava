package test.singletons;

public enum EnumSingleton {
	INSTANCE;
	private int val = 42;

	public int getVal() {
		return val;
	}
}

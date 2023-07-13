package test.singletons;

public class SingletonFactory<T> {
	private static SingletonFactory instance;
	private T instanceValue;

	private SingletonFactory() {}

	public static synchronized <T> SingletonFactory<T> getInstance() {
		if (instance == null) {
			instance = new SingletonFactory<T>();
		}
		return instance;
	}

	public T getInstanceValue() {
		return instanceValue;
	}

	public void setInstanceValue(T instanceValue) {
		this.instanceValue = instanceValue;
	}
}

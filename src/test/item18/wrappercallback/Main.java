package test.item18.wrappercallback;

public class Main {
	public static void main(String[] args) {
		Main wrapperCallBack = new Main();
		SomeService   service       = new SomeService();
		WrappedObject wrappedObject = new WrappedObject(service);
		Wrapper       wrapper       = new Wrapper(wrappedObject);

		wrapper.doSomething();
	}
}

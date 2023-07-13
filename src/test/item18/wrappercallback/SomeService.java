package test.item18.wrappercallback;

final class SomeService {

		void performAsync(SomethingWithCallback callback) {
			new Thread(() -> {
				perform();
				System.out.println("class = " + callback.getClass());
				callback.call();
			}).start();
		}

		void perform() {
			System.out.println("Service is being performed.");
		}
}

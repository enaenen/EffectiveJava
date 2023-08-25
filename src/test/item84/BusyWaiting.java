package test.item84;

public class BusyWaiting {

	public static void main(String[] args) {
		SlowCountDownLatch slowCountDownLatch = new SlowCountDownLatch(10);
		slowCountDownLatch.countDown();
		slowCountDownLatch.await();
	}

	static class SlowCountDownLatch {

		private int count;

		public SlowCountDownLatch(int count) {
			if (count < 0) {
				throw new IllegalArgumentException(count + " < 0");
			}
			this.count = count;
		}

		public void await() {
			while (true) {
				synchronized (this) {
					if (count == 0) {
						return;
					}
				}
			}
		}

		public synchronized void countDown() {
			if (count != 0) {
				count--;
			}
		}
	}

}

package test.item84;

public class ThreadYield {
		public static void main(String[] args) {
			Thread producer = new Thread(new ProducerThread(), "생산자");
			Thread consumer = new Thread(new ConsumerThread(), "소비자");

			producer.start();
			consumer.start();
		}
	}

	class ProducerThread implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " 아이템 생산 " + i);
//				Thread.yield(); // 시간 양보
			}
		}
	}

	class ConsumerThread implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " 아이템 소비 " + i);
//				Thread.yield(); // 시간 양보
			}
		}

}

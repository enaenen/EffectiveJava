package test.item72;

import java.util.ArrayList;
import java.util.List;

public class RecycleExceptions {

	static class Decks {

		List<Integer> cards = new ArrayList<>();

		public Decks() {
			for (int i = 1; i < 53; i++) {
				cards.add(i);
			}
		}

		public List<Integer> pickCards(Integer amount) throws IllegalArgumentException {
			if (amount == null) {
				throw new NullPointerException("amount is null");
			}
			if (amount < 0) {
				throw new IllegalStateException("amount is less than 0");
			}
			if (amount > cards.size()) {
				throw new IllegalArgumentException("amount is bigger than cards.length");
			}

			List<Integer> pickedCards = new ArrayList<>();
			for (int i = 0; i < amount; i++) {
				pickedCards.add(cards.remove(0));
			}
			return pickedCards;
		}
	}

	public static void main(String[] args) {

	}

	public static void test() {
	}

}

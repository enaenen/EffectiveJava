package test.item58;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class UseForEach {

	enum Suit {CLUB, DIAMOND, HEART, SPADE}
	enum Rank {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

	enum Face {ONE, TWO, THREE, FOUR, FIVE, SIX}

	static class Card {

		Suit suit;
		Rank rank;

		Card(Suit suit, Rank rank) {
			this.suit = suit;
			this.rank = rank;
		}

		@Override
		public String toString() {
			return "Card{" +
					"suit=" + suit +
					", rank=" + rank +
					'}';
		}
	}

	public static void main(String[] args) {

		List<Card> deck = new ArrayList<>();
		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());
/* BUG 1
		for (Iterator<Suit> i = suits.iterator(); i.hasNext();)
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
				deck.add(new Card(i.next(), j.next()));
*/

		//V1
		/*
		for (Iterator<Suit> i = suits.iterator(); i.hasNext(); ) {
			Suit suit = i.next();
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext(); ) {
				deck.add(new Card(suit, j.next()));
			}
		}
		*/
		// V2
		for (Suit suit :suits)
			for (Rank rank : ranks)
				deck.add(new Card(suit, rank));


		Collection<Face> faces = EnumSet.allOf(Face.class);
		/* BUG2
		for (Iterator<Face> i = faces.iterator(); i.hasNext();)
			for (Iterator<Face> j = faces.iterator(); j.hasNext(); ) {
				System.out.println(i.next() + " " + j.next());
			}
			*/
		for (Face face : faces)
			for (Face face2 : faces)
				System.out.println(face + " " + face2);

		for (Card card : deck) {
			System.out.println(card);
		}
	}
}

package edu.cnm.deepdive;

/**
 * Instances this class represents single cards in a deck of standard playing
 * cards. These instances are imutable once initalized, the rank and suit of a car cannot be changed
 *
 *
 * @author Lance Zotigh &amp; Deep Dive Coding Java + Android Bootcamp cohort 6
 * @version 1.0
 */
public class Card {

  private final Rank rank;
  private final Suit suit;

  /**
   * initializes the <code>Card</code> instance with the specified {@link Suit} and {@link Rank}
   *
   * @param rank card rank (A, 2, &hellip; K).
   * @param suit cards suit uit (Clubs, Diamonds, Hearts, Spades).
   */
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return String.format("%s %s", rank, suit);
  }

}

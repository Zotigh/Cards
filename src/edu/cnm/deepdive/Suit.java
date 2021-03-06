package edu.cnm.deepdive;

/**
 * This enum implements suits of standard playing cards. Each enumerated value
 * uses the standard symbol for that suit (taken from unicode) as its
 * string representation.
 *
 * @author Lance Zotigh &amp; Deep Dive Coding Java + Android Bootcamp cohort 6
 * @version 1.0
 */
public enum Suit {

  CLUBS("\u2663", Color.Black),
  DIAMONDS("\u2661", Color.Red),
  HEARTS("\u2662", Color.Red),
  SPADES("\u2660", Color.Black);

  private final String symbol;
  private final Color color;

  Suit(String symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  public Color getColor() {
    return color;
  }

  @Override
  public String toString() {
    return symbol;
  }

  public enum Color {
    Red, Black;
  }

}


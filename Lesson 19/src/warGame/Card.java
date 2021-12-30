package warGame;

import java.util.Random;

public class Card  {
    private final int NUMBER_OF_CARDS = 52;
    private int value;
    private Card[] cards;
    private String name;

    Card() {}

    Card(String name, int value) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
        if (value > 14) {
            return;
        }
        this.value = value;
    }

    public int getNUMBER_OF_CARDS() {
        return NUMBER_OF_CARDS;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 14) {
            return;
        }
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !(name.equals(""))) {
            this.name = name;
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    void shuffleCards() {
        for (int count = 1; count < NUMBER_OF_CARDS; count++) {
            int cardIndex = (int) (Math.random() * NUMBER_OF_CARDS);

            Card temp = this.cards[count - 1];
            this.cards[count - 1] = this.cards[cardIndex];
            this.cards[cardIndex] = temp;
        }
    }

    void shuffleCardsDeck() {
        for (int count = 1; count < 26; count++) {
            int cardIndex = (int) (Math.random() * 26);

            Card temp = this.cards[count - 1];
            this.cards[count - 1] = this.cards[cardIndex];
            this.cards[cardIndex] = temp;
        }
    }

      Card getRandom(Card[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}

package Card;

/**
 * Абстрактный класс карты
 *
 * @author Vsevolod Gordienko
 * @version 1.0
 */
public abstract class Card {
    private Suits suit;

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    public FrameColors getFrameColor() {
        return frameColor;
    }


    private Ranks rank;
    private FrameColors frameColor;

    public Card(Suits suit, Ranks rank, FrameColors frameColor) {
        this.suit = suit;
        this.rank = rank;
        this.frameColor = frameColor;
    }
}

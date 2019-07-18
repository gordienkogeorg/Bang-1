package Cards;

public abstract class Card {
    private Suits suit;
    private Ranks rank;
    private FrameColors frameColor;

    public Card(Suits suit, Ranks rank, FrameColors frameColor) {
        this.suit = suit;
        this.rank = rank;
        this.frameColor = frameColor;
    }
}

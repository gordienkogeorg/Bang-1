public abstract class Card {
    // Масть
    private enum Suits {
        Diamonds,
        Hearts,
        Spades,
        Clubs
    }

    // Достоинство
    private enum Rank{
        Ace,
        King,
        Queen,
        Jack,
        ten,
        nine,
        eight,
        seven,
        six,
        five,
        four,
        three,
        two
    }

    // Цвет рамки
    private enum FrameColor{
        Brown,
        Blue,
        Green
    }
}

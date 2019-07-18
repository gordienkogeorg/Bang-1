package Player;

import Game.Roles;

/**
 * Класс игрока
 *
 * @author Vsevolod Gordienko
 * @version 1.0
 */
public class Player {
    private Roles role;
    private Character character;
    private Health health;
    private Hand hand;
    private Field field;

    public Roles getRole() {
        return role;
    }

    public Character getCharacter() {
        return character;
    }

    public Health getHealth() {
        return health;
    }

    public Hand getHand() {
        return hand;
    }

    public Field getField() {
        return field;
    }

    public Player(Roles role, Character character, Health health, Hand hand) {
        this.role = role;
        this.character = character;
        this.health = health;
        this.hand = hand;
        this.field = null;
    }
}

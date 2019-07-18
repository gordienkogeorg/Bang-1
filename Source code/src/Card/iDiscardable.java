package Card;

import Player.Player;

/**
 * Интерфейс сброса карты у игрока
 *
 * @author Vsevolod Gordienko
 * @version 1.0
 */
public interface iDiscardable {
    /**
     * Скинуть карту у игрока-цели (можно даже у себя, например - в конце хода)
     *
     * @param player - Игрок-цель
     */
    void Discard(Player player);
    //TODO: Сделать проверку на наличие карт у игрока-цели
}

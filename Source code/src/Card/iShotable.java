package Card;

import Player.Player;

/**
 * Интерфейс выстрела
 *
 * @author Vsevolod Gordienko
 * @version 1.0
 */
public interface iShotable {
    /**
     * @param player - игрок-цель
     */
    void DoShoot(Player player);
}

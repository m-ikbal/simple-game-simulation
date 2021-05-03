package Concrete;

import Entities.Game;
import Entities.Player;
import interfaces.GameService;

public class GameManager implements GameService {

    @Override
    public void salesGame(Game game) {
        System.out.println("Oyun satıldı : " + game.getName() + "\n" + "Kalan stok miktarı: " + (game.getStockAmount() - 1));
    }

    @Override
    public void salesPlayer(Player player) {
        System.out.println("Oyun satın alındı. Satın alan: " + player.getFirstName());
    }
}

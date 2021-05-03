package Concrete;

import Entities.Member;
import Entities.Player;
import interfaces.PlayerService;

public class PlayerManager implements PlayerService {
    @Override
    public void save(Player player) {
        System.out.println("Oyuncu kayıt edildi: " + player.getUserName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Oyuncu güncellendi: " + player.getUserName());
    }

    @Override
    public void delete(Player player) {
        System.out.println("Oyuncu silindi: " + player.getUserName());
    }
}

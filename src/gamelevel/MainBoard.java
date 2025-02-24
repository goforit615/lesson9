package gamelevel;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.player(1);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.player(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.player(3);
    }
}

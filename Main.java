import com.gamecontrol.devkasatkin.Game;

public class Main {
    public static void main(String[] args) {
        Game game = Game.getInstance();
        System.out.println(game);
        game.run();
    }
}

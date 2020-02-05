package singleton;

import java.util.List;

public class ScrabbleTiles implements Runnable {
    @Override
    public void run() {
        Scrabble scrabble = Scrabble.getInstance();
        System.out.println(scrabble.getAvailableLetters());
        System.out.println();

        List<String> playerTiles = scrabble.getTiles(7);
        System.out.println("Instance ID:" + System.identityHashCode(scrabble));
        System.out.println("Player tiles: " + playerTiles);
        System.out.println();
    }
}

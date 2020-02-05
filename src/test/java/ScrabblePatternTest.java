import org.junit.Test;
import singleton.Scrabble;
import singleton.ScrabbleTiles;

import java.util.List;

public class ScrabblePatternTest {

    @Test
    public void singletonPatternTest() {
        Scrabble scrabble = Scrabble.getInstance();
        System.out.println("Instance 1 ID:" + System.identityHashCode(scrabble));
        System.out.println(scrabble.getAvailableLetters());
        System.out.println();

        List<String> playerOneTiles = scrabble.getTiles(7);
        System.out.println("Player one tiles: " + playerOneTiles);
        System.out.println();

        Scrabble secondScrabble = Scrabble.getInstance();
        System.out.println("Instance 2 ID:" + System.identityHashCode(secondScrabble));
        System.out.println(secondScrabble.getAvailableLetters());
        System.out.println();

        List<String> playerTwoTiles = scrabble.getTiles(7);
        System.out.println("Player two tiles: " + playerTwoTiles);
        System.out.println();

        System.out.println("Remaining letter: " + secondScrabble.getAvailableLetters());
    }

    @Test
    public void singletonPatternWithThreadsTest() {
        Runnable firstPlayerTiles = new ScrabbleTiles();
        Runnable secondPlayerTiles = new ScrabbleTiles();

        new Thread(firstPlayerTiles).start();
        new Thread(secondPlayerTiles).start();
    }
}

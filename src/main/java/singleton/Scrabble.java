package singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Scrabble {
    static boolean _firstThread = true;
    private static Scrabble _finalInstance = null;
    String[] _scrabbleLetters = {
            "a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c",
            "d", "d", "d", "d", "e", "e", "e", "e", "e", "e", "e", "e", "e",
            "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i", "i",
            "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m",
            "m", "n", "n", "n", "n", "n", "n", "o", "o", "o", "o", "o", "o",
            "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s",
            "s", "s", "t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v",
            "v", "w", "w", "x", "y", "y", "z",
    };
    private List<String> _availableLetters = new LinkedList<>(Arrays.asList(_scrabbleLetters));

    private Scrabble() {
        // private constructor
    }

    public static Scrabble getInstance() {
        if (_firstThread) {
            Thread.currentThread();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

        }

        if (_finalInstance == null) {
            // Lazy instantiation
            _finalInstance = new Scrabble();
            Collections.shuffle(_finalInstance._availableLetters);
        }

        return _finalInstance;
    }

    public List<String> getAvailableLetters() {
        return _finalInstance._availableLetters;
    }

    public List<String> getTiles(int howManyTiles) {
        List<String> tilesToSend = new LinkedList<>();

        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(_finalInstance._availableLetters.remove(0));
        }

        return tilesToSend;
    }
}

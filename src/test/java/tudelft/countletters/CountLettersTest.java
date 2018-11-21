package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void singleMatchingWordR() {
        int words = new CountLetters().count("cdr");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void singleMatchingWordS() {
        int words = new CountLetters().count("cats");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void nonMatchingWord() {
        int words = new CountLetters().count("cat");
        Assertions.assertEquals(0, words);
    }

    @Test
    public void multipleMatchingWordsS() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchS() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsR() {
        int words = new CountLetters().count("editor|compiler");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchR() {
        int words = new CountLetters().count("editor|compile");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void nonLastWordDoesNotMatch() {
        int words = new CountLetters().count("compile|editor");
        Assertions.assertEquals(1, words);
    }

}

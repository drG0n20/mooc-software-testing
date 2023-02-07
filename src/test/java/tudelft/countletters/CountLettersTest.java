package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWordsRS() {
        int words = new CountLetters().count("car|dogs");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void multipleMatchingWordsSR() {
        int words = new CountLetters().count("cas|dogr");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void multipleMatchingWordsRR() {
        int words = new CountLetters().count("car|dogr");
        Assertions.assertEquals(2, words);
    }
    @Test
    public void multipleMatchingWordsSS() {
        int words = new CountLetters().count("cas|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatchS() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }
    @Test
    public void lastWordDoesNotMatchSs() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleMatchingWordsWithoutS() {
        int words = new CountLetters().count("cah|dogr");
        Assertions.assertEquals(1, words);
    }
}
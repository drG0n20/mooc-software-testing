package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void noHappyG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void yesHappyG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void twoGHappyG() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void treeHappy() {
        GHappy happy = new GHappy();
        boolean result = happy.gHappy("sagggsf");
        Assertions.assertTrue(result);
    }
}

package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @Test
    public void abcCase() {
        CaesarShiftCipher lower = new CaesarShiftCipher();
        String result = lower.CaesarShiftCipher("abc", 3);
        Assertions.assertEquals(result, "def");
    }

    @Test
    public void xyzCase() {
        CaesarShiftCipher lower = new CaesarShiftCipher();
        String result = lower.CaesarShiftCipher("xyz", 3);
        Assertions.assertEquals(result, "abc");
    }

}

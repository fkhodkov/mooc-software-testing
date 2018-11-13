package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void xxggxx() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void xxgxx() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void xxggyygxx() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void ggxxgg() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("ggxxgg");
        Assertions.assertTrue(result);
    }
}

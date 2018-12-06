package tudelft.mirror;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class MirrorTest {
    void simpleTest(String argument, String result) {
        Mirror mirror = new Mirror();
        Assertions.assertEquals(result, mirror.mirrorEnds(argument));
    }

    @Test
    void abXYZba() {
        simpleTest("abXYZba", "ab");
    }
    @Test
    void abca() {
        simpleTest("abca", "a");
    }
    @Test
    void aba() {
        simpleTest("aba", "aba");
    }
    @Test
    void aa() {
        simpleTest("aa", "aa");
    }
    @Test
    void abba() {
        simpleTest("abba", "abba");
    }
}

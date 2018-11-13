package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    @Test
    public void invalidMessageDigit() {
        String invalidMsg = "message 1";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("invalid",
                                csc.CaesarShiftCipher(invalidMsg, 10));
    }

    @Test
    public void invalidMessageCapital() {
        String invalidMsg = "Message";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("invalid",
                                csc.CaesarShiftCipher(invalidMsg, 10));
    }

    @Test
    public void validMessageZeroShift() {
        String message = "message";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("message",
                                csc.CaesarShiftCipher(message, 0));
    }

    @Test
    public void validMessageWithSpaceZeroShift() {
        String message = "message with space";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("message with space",
                                csc.CaesarShiftCipher(message, 0));
    }

    @Test
    public void validMessage() {
        String message = "abc";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("def",
                                csc.CaesarShiftCipher(message, 3));
    }

    @Test
    public void validMessageWithSpace() {
        String message = "abc def";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("def ghi",
                                csc.CaesarShiftCipher(message, 3));
    }

    @Test
    public void validMessageOverBoundary() {
        String message = "xyz";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("abc",
                                csc.CaesarShiftCipher(message, 3));
    }

    @Test
    public void validMessageOverBoundaryNegative() {
        String message = "abc";
        CaesarShiftCipher csc = new CaesarShiftCipher();
        Assertions.assertEquals("xyz",
                                csc.CaesarShiftCipher(message, -3));
    }
}

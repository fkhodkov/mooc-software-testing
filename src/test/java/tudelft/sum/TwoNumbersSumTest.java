package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {
    @Test
    public void add12And0() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{0}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

    @Test
    public void add0And25() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{0}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

    @Test
    public void add12And25() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{3, 7}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

    @Test
    public void add1And25() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 6}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

    @Test
    public void add12And2() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 4}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

    @Test
    public void add17And25() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 7}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 2}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

    @Test
    public void add87And25() {
        ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList(new Integer[]{8, 7}));
        ArrayList<Integer> x2 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 5}));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 1, 2}));
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(x1, x2);
        Assertions.assertEquals(y, result);
    }

}

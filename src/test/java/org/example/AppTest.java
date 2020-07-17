package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    App obj = new App();
    @Test
    public void repeatedStringTest() {
        String testString = "aba";
        long num = 10;

        long expected = 7;
        long actual = obj.repeatedString(testString, num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void repeatedStringTest2() {
        String testString = "a";
        long num = 1000000000000L;

        long expected = 1000000000000L;
        long actual = obj.repeatedString(testString, num);

        Assert.assertEquals(expected, actual);
    }
}

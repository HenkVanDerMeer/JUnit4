package utils;

import org.junit.Test;

import java.util.Base64;

public class Base64UtilsTest {

    @Test
    public void testTest() {
        System.out.println("Test test...");
    }

    @Test
    public void testBase64decode() {
        String text = "VGVzdCBpbnB1dA==";
        assert(Base64Utils.decode(text).equals("Test input"));
    }

    @Test
    public void testBase64encode() {
        String text = "Test input";
        System.out.println(Base64Utils.encode(text));
        assert(Base64Utils.encode(text).equals("VGVzdCBpbnB1dA=="));
    }
}

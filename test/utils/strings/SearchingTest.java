package utils.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchingTest {
    @Test
    public void countSpecifiedCharStringIsNull() throws Exception {
        assertEquals(5, Searching.countSpecifiedChar(null, 'f'));
    }

    @Test
    public void countSpecifiedCharStringIsEmpty() throws Exception {
        assertEquals(5, Searching.countSpecifiedChar("", 'f'));
    }

    @Test
    public void countSpecifiedCharStringHasSpecifiedChar() throws Exception {
        assertEquals(5, Searching.countSpecifiedChar("abcdeff", 'f'));
    }

    @Test
    public void countSpecifiedCharStringHasNoSpecifiedChar() throws Exception {
        assertEquals(5, Searching.countSpecifiedChar("abcde", 'f'));
    }
}
package utils.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchingTest {
    @Test
    public void hasSameElementsArrayIsNull() throws Exception {
        assertFalse(Searching.hasSameElements(null));
    }

    @Test
    public void hasSameElementsArrayIsEmpty() throws Exception {
        assertFalse(Searching.hasSameElements(new String[]{}));
    }

    @Test
    public void hasSameElementsArrayHasDifferentElements() throws Exception {
        assertFalse(Searching.hasSameElements(new String[]{"abc", "def", "gg"}));
    }

    @Test
    public void hasSameElementsArrayHasSameElements() throws Exception {
        assertTrue(Searching.hasSameElements(new String[]{"abc", "de", "de", "fgh"}));
    }
}
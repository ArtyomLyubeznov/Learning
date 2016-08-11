package utils.matrices;

import org.junit.Test;

import static org.junit.Assert.*;

public class OperationsTest {
    @Test
    public void multiplyTestOneMatrixIsNull() throws Exception {
        assertArrayEquals(null, Operations.multiply(null, new int[][]{
                {1, 2, 3},
                {5, 6, 7}
        }));
    }

    @Test
    public void multiplyTestOneMatrixIsEmpty() throws Exception {
        assertArrayEquals(null, Operations.multiply(new int[][]{}, new int[][]{
                {1, 2, 3},
                {5, 6, 7}
        }));
        assertArrayEquals(null, Operations.multiply(new int[2][0], new int[][]{
                {1, 2, 3},
                {5, 6, 7}
        }));
    }

    @Test
    public void multiplyTestOneArrayIsNotMatrix() throws Exception {
        assertArrayEquals(null, Operations.multiply(
                new int[][]{
                        {1, 2, 3},
                        {4, 5},
                        {6}}, new int[][]{
                        {1, 2, 3},
                        {5, 6, 7}
                }));
    }

    @Test
    public void multiplyTestMatricesCannotBeMultiplied() throws Exception {
        assertArrayEquals(null, Operations.multiply(new int[][]{
                        {1, 2, 3},
                        {3, 4, 5}
                }, new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8}
                }));
    }

    @Test
    public void multiplyTest() throws Exception {
        assertArrayEquals(new int[][]{
                        {11, 14, 17, 20},
                        {23, 30, 37, 44},
                        {35, 46, 57, 68}},
                Operations.multiply(new int[][]{
                        {1, 2},
                        {3, 4},
                        {5, 6}
                }, new int[][]{
                        {1, 2, 3, 4},
                        {5, 6, 7, 8}
                }));
    }
}
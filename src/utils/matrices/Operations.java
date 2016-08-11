package utils.matrices;

public final class Operations {
    public static int[][] multiply(int[][] left, int[][] right) {
        if (!isCanBeMultiplied(left, right)) {
            return null;
        }
        int[][] result = new int[left.length][right[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < left[0].length; k++) {
                    result[i][j] += left[i][k]*right[k][j];
                }
            }
        }
        return result;
    }

    private static boolean isCanBeMultiplied(int[][] left, int[][] right) {
        if (isMatrix(left) && isMatrix(right) && left[0].length == right.length) {
            return true;
        }
        return false;
    }

    private static boolean isMatrix(int[][] data) {
        if (data == null || data.length == 0)
            return false;
        for (int i = 1; i < data.length; i++) {
            if (data[i].length != data[0].length) {
                return false;
            }
        }
        return true;
    }
}

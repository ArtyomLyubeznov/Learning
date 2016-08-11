package utils.arrays;

public final class Searching {

    public static boolean hasSameElements(String[] data) {
        if (isEmpty(data)) return false;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] == data[i]){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isEmpty(String[] data) {
        if (data == null || data.length == 0) {
            return true;
        }
        return false;
    }
}

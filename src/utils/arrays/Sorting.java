package utils.arrays;

public final class Sorting {

    public static void bubbleSort(int[] data) {
        if (!isSortable(data))
            return;
        for (int border = data.length - 1; border >= 0; border--) {
            for (int index = 0; index < border; index++) {
                if (data[index] > data[index + 1]) {
                    swap(data, index);
                }
            }
        }
    }

    private static boolean isSortable(int[] data){
        if (data == null || data.length == 1)
            return false;
        return true;
    }

    private static void swap(int[] data, int index) {
        int tmp = data[index];
        data[index] = data[index + 1];
        data[index + 1] = tmp;
    }
}
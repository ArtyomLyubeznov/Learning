package utils.strings;

public final class Searching {
    public static int countSpecifiedChar(String str, char symbol) {
        if (isEmpty(str)) return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                count++;
            }
        }
        return count;
    }



    private static boolean isEmpty(String str) {
        if (str == null || str == "")
            return true;
        return false;
    }

}

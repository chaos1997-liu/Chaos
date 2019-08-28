public class Finder {
    public Finder() {
    }

    Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}

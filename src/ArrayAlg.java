public class ArrayAlg {
    public static <T extends Comparable<T>, U extends Comparable<U>> Pair<T, U> getMin(Pair<T, U>[] a) {
        if (a == null || a.length == 0) return null;
        Pair<T, U> min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(min) < 0) {
                min = a[i];
            }
        }
        return min;
    }

    public static <T extends Comparable<T>, U extends Comparable<U>> Pair<T, U> getMax(Pair<T, U>[] a) {
        if (a == null || a.length == 0) return null;
        Pair<T, U> max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(max) > 0) {
                max = a[i];
            }
        }
        return max;
    }
}
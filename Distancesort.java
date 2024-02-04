import java.util.Arrays;
import java.util.Comparator;

public class DistanceSort {
    public static void main(String[] args) {
        int[] x = {9, 1, 12, 4, 2};
        int z = 6;
        distSort(x, x.length, z);
        System.out.println(Arrays.toString(x)); // Output: [4, 9, 2, 1, 12]
    }

    public static void distSort(int[] x, int n, int z) {
        Arrays.sort(x, Comparator.comparingInt(a -> Math.abs(a - z)));
    }
}

import java.util.*;
public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;

        for (int i : arr) sum += i;

        return sum;
    }

    public static int[] rowSums(int[][] arr) {
        int[] out = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                out[i] += arr[i][j];
            }
        }

        return out;
    }

    public static boolean isDiverse(int[][] arr) {
        int[] x = rowSums(arr);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == j) continue;
                else if (x[i] == x[j]) return false;
            }
        }

        return true;
    }
}


import java.util.*;

public class CopyArray {

    static Scanner s = new Scanner(System.in);

    public static int[] solve(int[] a) {
        int res[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        return res;
    }

    public static void main(String args[]) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(a));
        int[] x = solve(a);
        System.out.println("Duplicate Array : " + Arrays.toString(x));
    }
}

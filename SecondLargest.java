
import java.util.*;

public class SecondLargest {

    public static int[] find(int a[]) {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                secondLarge = large;
                large = a[i];
            }
            // small = Math.min(a[i], small);
            if (a[i] < small) {
                small = a[i];
            }
        }
        System.out.println("Largest Element: " + large);
        System.out.println("Second Largest Element: " + secondLarge);
        if (secondLarge == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        }
        System.out.println("Smallest Element: " + small);
        return a;
    }

    public static void main(String[] args) {
        int[] a = {10, 1, 2, 4, 5, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(a));
        find(a);
    }
}

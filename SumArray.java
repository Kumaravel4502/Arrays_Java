
import java.util.Arrays;

public class SumArray {

    public static int[] sumArr(int a[]) {
        int Sum = 0;
        for (int i = 0; i < a.length; i++) {
            Sum += a[i];
        }
        System.out.println("The Sum of the Array is : " + Sum);
        return a;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        System.out.println("Original Array : " + Arrays.toString(a));
        sumArr(a);
    }
}

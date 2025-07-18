import java.util.Arrays;

public class ZigZagArray {

    public static int[] zigZag(int a[], int b[]) {
        int m = 0, n = 0;
        int res[] = new int[a.length + b.length];
        for (int i = 0; i < res.length; i++) {

            if (i % 2 == 0) {
                res[i] = a[m++];
            } else if (n < b.length) {
                res[i] = b[n++];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int b[] = {50, 60, 70, 80};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        int[] res = zigZag(a, b);
        System.out.println("The ZigZag of Two Array is : " + Arrays.toString(res));
    }

}

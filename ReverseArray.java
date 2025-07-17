
import java.util.*;

class ReverseArray {

    //Revrersing an array
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}

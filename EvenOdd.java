
import java.util.*;

public class EvenOdd {

    static Scanner s = new Scanner(System.in);
    static int even = 0, odd = 0;

    public static void main(String[] args) {
        System.out.println("Enter the size of an Array : ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of an Array : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The number of even numbers in the array are : " + even);
        System.out.println("The number of odd numbers in the array are : " + odd);

    }
}

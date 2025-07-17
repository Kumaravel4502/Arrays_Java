
class LargeSmall {

    public static void findLargSmall(int[] a) {
        int Large = Integer.MIN_VALUE;
        int Small = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > Large) {
                Large = a[i];
            } else if (a[i] < Small) {
                Small = a[i];
            }
        }
        System.out.println("Largest number in the array is : " + Large);
        System.out.println("Smallest number in the array is : " + Small);
    }

    public static void main(String[] args) {
        int a[] = {10, 3, 4, 7, 1, 20};
        findLargSmall(a);
    }
}

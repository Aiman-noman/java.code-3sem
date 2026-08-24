import java.util.*;
class array_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
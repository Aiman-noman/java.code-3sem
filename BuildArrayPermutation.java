import java.util.*;
class BuildArrayPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] result = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            result[i] = a[a[i]];
        for (int i = 0; i < n; i++)
            System.out.print(result[i] + " ");
    }
}

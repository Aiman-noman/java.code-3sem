import java.util.*;
class KidsWithCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for (int i = 0; i < n; i++)
            candies[i] = sc.nextInt();
        int extraCandies = sc.nextInt();
        int max = candies[0];
        for (int i = 1; i < n; i++)
            if (candies[i] > max)
                max = candies[i];
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max)
                System.out.print("true ");
            else
                System.out.print("false ");
        }
    }
}

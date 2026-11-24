import java.util.*;
class HighestAltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int gain = sc.nextInt();
            sum = sum + gain;
            if (sum > max)
                max = sum;
        }
        System.out.println(max);
    }
}

import java.util.Scanner;
class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++)
            digits[i] = sc.nextInt();
 
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                for (int j = 0; j < n; j++)
                    System.out.print(digits[j]);
                return;
            }
            digits[i] = 0;
        }
 
        System.out.print(1);
        for (int i = 0; i < n; i++)
            System.out.print(0);
    }
}

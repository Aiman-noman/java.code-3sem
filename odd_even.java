import java.util.*;

class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements in the array");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int even_count = 0;
        int odd_count = 0;

        for(int i = 0; i < n; i++) {
            if(a[i] % 2 == 0) {
                even_count++;
            }
            else {
                odd_count++;
            }
        }

        System.out.println("Even count is " + even_count);
        System.out.println("Odd count is " + odd_count);
    }
}
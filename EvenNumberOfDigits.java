import java.util.*;
 
class EvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
 
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int digits = 0;
 
            do {
                digits++;
                num = num / 10;
            } while (num > 0);
 
            if (digits % 2 == 0)
                count++;
        }
 
        System.out.println(count);
    }
}

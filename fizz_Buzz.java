
import java.util.*;

class fizz_Buzz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("FizzBuzz");

            } else if (i % 3 == 0) {
                answer.add("Fizz");

            } else if (i % 5 == 0) {
                answer.add("Buzz");

            } else {
                answer.add(String.valueOf(i));
            }
        }

        System.out.println(answer);
    }
}

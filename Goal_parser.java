
import java.util.Scanner;

class Goal_parser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter command: ");
        String command = input.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {

            if (command.charAt(i) == 'G') {
                result.append('G');

            } else if (command.charAt(i) == '(' &&
                       command.charAt(i + 1) == ')') {
                result.append('o');
                i++;

            } else {
                result.append("al");
                i += 3;
            }
        }

        System.out.println("Result: " + result.toString());

    }
}

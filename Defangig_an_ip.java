
import java.util.Scanner;

class Defangig_an_ip {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter IP Address: ");
        String address = input.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }

        System.out.println(result.toString());

        input.close();
    }
}


import java.util.*;

class string_find_type {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String s = sc.nextLine();

        int upper = 0;
        int lower = 0;
        int digit = 0;
        int space = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            }
            else if (Character.isLowerCase(ch)) {
                lower++;
            }
            else if (Character.isDigit(ch)) {
                digit++;
            }
            else if (Character.isWhitespace(ch)) {
                space++;
            }
        }

        System.out.println("Uppercase = " + upper);
        System.out.println("Lowercase = " + lower);
        System.out.println("Digits = " + digit);
        System.out.println("Spaces = " + space);

        sc.close();
    }
}

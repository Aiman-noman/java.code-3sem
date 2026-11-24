import java.util.Scanner;
class DetectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        if (word.equals(word.toUpperCase()) ||
            word.equals(word.toLowerCase()) ||
            (Character.isUpperCase(word.charAt(0)) &&
             word.substring(1).equals(word.substring(1).toLowerCase())))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

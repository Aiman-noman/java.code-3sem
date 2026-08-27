import java.util.*;
class string_user{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();

        System.out.println("Character at 6th location is "+s.charAt(6));
        System.out.println("Length "+s.length());
        System.out.println("Upper case of string is "+s.toUpperCase());
        System.out.println("Lower case of string is "+s.toLowerCase());
        System.out.println("String starts with hello "+s.startsWith("Hello"));
        System.out.println("String ends with hi "+s.endsWith("hi"));
        System.out.println("String contsins "+s.contains("aiman"));
        System.out.println("Index of H in the string"+s.indexOf("H"));
        System.out.println("Substring from 0 to 7 is "+s.substring(0,6));
    }
}
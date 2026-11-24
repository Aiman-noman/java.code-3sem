public class exception_handling {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (Exception e) {
            System.out.println("You are dividing by zero");
        }
    }
}
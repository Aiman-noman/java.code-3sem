import java.util.Scanner;

class Overloading_logian {

    void logging(String username) {
        System.out.println("Username: " + username);
    }

    void logging(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    void logging(String username, String password, int otp) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("OTP: " + otp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Overloading_logian obj = new Overloading_logian();

        System.out.print("Enter username: ");
        String name = sc.nextLine();
        obj.logging(name);

        System.out.print("Enter username: ");
        String name2 = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        obj.logging(name2, pass);

        System.out.print("Enter username: ");
        String name3 = sc.nextLine();

        System.out.print("Enter password: ");
        String pass2 = sc.nextLine();

        System.out.print("Enter OTP: ");
        int otp = sc.nextInt();
        obj.logging(name3, pass2, otp);

    }
}
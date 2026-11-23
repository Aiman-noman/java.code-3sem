import java.util.Scanner;

class max_num {

    void max(int a, int b) {
        if (a > b)
            System.out.println("Maximum = " + a);
        else
            System.out.println("Maximum = " + b);
    }

    void max(int a, int b, int c) {
        if (a > b && a > c)
            System.out.println("Maximum = " + a);
        else if (b > c)
            System.out.println("Maximum = " + b);
        else
            System.out.println("Maximum = " + c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Maximum obj = new Maximum();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        obj.max(a, b);

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        obj.max(x, y, z);

    }
}
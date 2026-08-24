import java.util.*;

class array_2Duser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns");
        int columns = sc.nextInt();

        int a[][] = new int[rows][columns];

        System.out.println("Enter the elements:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of 2D array:");

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
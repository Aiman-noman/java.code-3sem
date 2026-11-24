import java.util.Scanner;
class AverageSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int salary = sc.nextInt();
            sum = sum + salary;
            if (salary < min)
                min = salary;
            if (salary > max)
                max = salary;
        }
        double average = (double)(sum - min - max) / (n - 2);
        System.out.println(average);
    }
}

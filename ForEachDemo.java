public class ForEachDemo {
    public static void main(String[] args) {

        String[] subjects = {"Java", "DSA", "DBMS", "Maths"};

        for (String s : subjects) {
            System.out.println("Subject: " + s);
        }

        double[] temps = {31.5, 29.0, 33.2};
        double total = 0;

        for (double t : temps) {
            total += t;
        }

        System.out.printf("Average temperature: %.2f%n", total / temps.length);
    }
}
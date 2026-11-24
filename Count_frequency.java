public class Count_frequency {
    public static void main(String[] args) {

        int a[] = {10, 20, 20, 30, 30, 40};

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }

            System.out.println(a[i] + ":" + count);
        }
    }
}
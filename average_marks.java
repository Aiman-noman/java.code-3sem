class average_marks {

    public void avg(double a, double b) {
        System.out.println("Average = " + (a + b) / 2);
    }

    public void avg(double a, double b, double c) {
        System.out.println("Average = " + (a + b + c) / 3);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.avg(80, 50);
        s.avg(90, 20, 77);
    }
}
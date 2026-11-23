class Student {

    int rollno;
    String name;
    static String college = "DSU";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {

        Student s1 = new Student(20, "ABC");
        Student s2 = new Student(21, "RQP");

        s1.display();
        s2.display();
    }
}
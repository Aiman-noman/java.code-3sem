class calculate_area {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int width) {
        System.out.println("Area of Rectangle = " + (length * width));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {

        calculate_area a = new calculate_area();

        a.area(5);
        a.area(10, 5);
        a.area(7.0);
    }
}
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + (length * breadth));
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(3, 2);
        Rectangle r2 = new Rectangle(5, 8);

        r1.display();
        r2.display();
    }
}
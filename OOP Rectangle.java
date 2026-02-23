class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Area: " + r.calculateArea());
    }
}

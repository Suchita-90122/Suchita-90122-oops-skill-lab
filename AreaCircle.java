package oops;

// Class to represent a Circle
class Circle {
    double radius = 5.0;

    // Method to calculate area
    void Area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

// Main class (must match file name: AreaCircle.java)
public class AreaCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.Area();
    }
}

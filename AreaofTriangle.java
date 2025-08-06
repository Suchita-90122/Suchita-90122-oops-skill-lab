package oops;

// Class to represent a triangle
class Triangle {
    void Area(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of the triangle: " + area);
    }
}

// Main class (must match file name: AreaofTriangle.java)
public class AreaofTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.Area(10.0, 5.0);  
    }
}

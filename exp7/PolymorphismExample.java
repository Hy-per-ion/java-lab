package exp7;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void calculateArea() {
        System.out.println("Calculating the area of a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    void calculateArea() {
        System.out.println("Calculating the area of a rectangle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
        // Polymorphism through method overloading
        calculateArea(new Circle());
        calculateArea(new Rectangle());
    }
    // Polymorphic method using method overloading
    static void calculateArea(Circle circle) {
        circle.calculateArea();
    }

    static void calculateArea(Rectangle rectangle) {
        rectangle.calculateArea();
    }
}

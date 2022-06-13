package oopsconcepts;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double area=Math.PI*radius*radius;
        System.out.println("Area of the circle is:"+area);
    }

    @Override
    void perimeter() {
        double perimeter=2*Math.PI*radius;
        System.out.println("perimeter of the circle is :"+perimeter);
    }
}

package oopsconcepts;

public class Square extends Shape{
private double side;
public Square(double side)
{
    this.side=side;
}
    @Override
    void area() {
        System.out.println("Area of the square is:"+(side*side));
    }

    @Override
    void perimeter() {
         System.out.println("perimeter of the Square is:"+(4*side));
    }
}

package oopsconcepts;
/*
A 2-dimensional point represents a location in (x,y) co-ordinate space.
Create a Point class, which will have two fields of int type: x and y.
User should be able to create Point instances in following ways:
a) Pass x and y co-ordinate values at the time of initialization.
b) If x and y values are not passed, then both x and y should be 0.
Provide the printPoint() method, which should print "Point: (x, y)" on to the console, x and y should
get replaced by values at runtime.
 */

class Coordinate
    {
        public int x;
        public int y;
        Coordinate(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
        void printpoint()
        {
            System.out.println("x:"+x+"\ny:"+y);
        }
    }
public class pointxandy {
    public static void main(String[] args)
    {
        Coordinate c=new Coordinate(10,15);
        c.printpoint();

    }
}

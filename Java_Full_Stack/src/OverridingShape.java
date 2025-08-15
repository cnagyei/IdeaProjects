/*
Shapes area
You have five classes: Shape, Triangle, Circle, Square, and Rectangle. The class Shape has a method area().
This method does nothing. Override the method in all subclasses. Overridden methods should return an area
of a particular figure. Use class fields for this.

The area of a triangle is S=bh/2 where
h is the height of the triangle,
b is the base of the triangle.

The area of a circle is S=πR^2 where
R is the radius of the circle. For
π use the Math.PI constant.

The area of a square is S=s^2 where
s is the length of the side of the square.

The area of a rectangle is S=wh where
w is the width of the rectangle and
h the height of the rectangle.
 */

class ShapeOverriding {
    public double area() {
        return 0;
    }
}

class Triangle extends ShapeOverriding {
    double height;
    double base;

    public double area() {
        return height * base * 1 / 2;
    }
}

class CircleOver extends ShapeOverriding {
    double radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}

class SquareOver extends ShapeOverriding {
    double side;

    public double area() {
        return side * side;
    }

class RectangleOver extends ShapeOverriding {
        double width;
        double height;

        public double area() {
            return width * height;
        }
    }
}

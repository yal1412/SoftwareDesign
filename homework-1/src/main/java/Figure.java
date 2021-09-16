public interface Figure {
    double calculateArea();
}

class Circle implements Figure {

    private final double radius;

    public Circle(double radius) {
        if (radius < 0) {
            System.out.println("error: radius < 0, radius will be changed to 0");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square implements Figure {
    private final double side;

    public Square(double side) {
        if (side < 0) {
            System.out.println("error: side < 0, side will be changed to 0");
            this.side = 0;
        } else {
            this.side = side;
        }
    }

    public double calculateArea() {
        return side * side;
    }
}

class Rectangle implements Figure {
    private final double verticalSide;
    private final double horizontalSide;

    public Rectangle(double verticalSide, double horizontalSide) {
        if (verticalSide < 0) {
            System.out.println("error: verticalSide < 0, verticalSide will be changed to 0");
            this.verticalSide = 0;
        } else {
            this.verticalSide = verticalSide;
        }

        if (horizontalSide < 0) {
            System.out.println("error: horizontalSide < 0, horizontalSide will be changed to 0");
            this.horizontalSide = 0;
        } else {
            this.horizontalSide = horizontalSide;
        }
    }

    public double calculateArea() {
        return verticalSide * horizontalSide;
    }
}

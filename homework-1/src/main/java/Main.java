public class Main {

    public static void main(String[] args) {
        // write your code here
        Circle c = new Circle(5);
        System.out.println("area of circle: " + c.calculateArea());

        Square s = new Square(5);
        System.out.println("area of square: " + s.calculateArea());

        Rectangle r = new Rectangle(3, 5);
        System.out.println("area of rectangle: " + r.calculateArea());

    }
}
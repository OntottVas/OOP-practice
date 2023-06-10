public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of "
                + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of "
                + c2.getArea());

        Circle c3 = new Circle(5, "blue");
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of "
                + c3.getArea());

        Circle c4 = new Circle();
        c4.setRadius(10.7);
        c4.setColor("white");
        System.out.println("c4 radius: " + c4.getRadius());
        System.out.println("c4 color: " + c4.getColor());

        Circle c5 = new Circle(7);
        System.out.println(c5.toString());

        Circle c6 = new Circle(6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6);
    }
}

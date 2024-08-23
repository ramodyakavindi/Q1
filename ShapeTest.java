public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Square and call its draw method
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();
        System.out.println();

        // Get an object of Circle and call its draw method
        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();
        System.out.println();

        // Get an object of Rectangle and call its draw method
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
        System.out.println();
    }
}

public class Rectangle implements Shape {
    @Override
    public void draw() {
        int width = 6; // Width of the rectangle
        int height = 3; // Height of the rectangle
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

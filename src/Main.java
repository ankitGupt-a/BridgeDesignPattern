public class Main {
    public static void main(String[] args) {
        Shape vectorCircle = new Circle(0, 0, 2, new vectorDrawingAPI());
        Shape rasterRectangle = new Rectangle(0, 0, 2, 2, new rasterDrawingAPI());

        vectorCircle.draw();;
        rasterRectangle.draw();
    }
}
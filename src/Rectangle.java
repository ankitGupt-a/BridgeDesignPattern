public class Rectangle extends Shape {
    private final double x, y, length, width;

    public Rectangle(final double x, final double y, final double length, final double width, final DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    public void draw() {
        drawingAPI.drawRectangle(x, y, length, width);
    }
}

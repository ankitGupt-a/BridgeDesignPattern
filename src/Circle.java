public class Circle extends Shape{
    private final double x, y, radius;
    public Circle(final double x, final double y, final double radius, final DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
}

public abstract class Shape {
    public final DrawingAPI drawingAPI;

    public Shape(final DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }
    public abstract void draw();

}

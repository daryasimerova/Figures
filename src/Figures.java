import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Figures {
    protected Color color;
    protected double lineWidth;
    private int type;
    abstract void draw(GraphicsContext gc);
    Point center;


    public Figures(Color color, double lineWidth, int type, Point center) {
        this.color = color;
        this.lineWidth = lineWidth;
        this.type = type;
        this.center = center;
    }

    public int getType() {
        return type;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public static final int FIGURE_TYPE_RECTANGLE = 0;
    public static final int FIGURE_TYPE_CIRCLE = 1;
    public static final int FIGURE_TYPE_TRIANGLE = 2;

}

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Circle extends Figures {
    private double radius;

    private Circle(Color color, double lineWidth, Point center) {
        super(color, lineWidth, FIGURE_TYPE_CIRCLE, center);
    }

    public Circle(Color color, double lineWidth, Point center, double radius) {
        this(color, lineWidth, center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void draw(GraphicsContext gc) {
    }
}



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Triangle extends Figures{
    public Triangle(Color color, double lineWidth, Point center) {
        super(color, lineWidth, FIGURE_TYPE_TRIANGLE, center);
    }

    public Triangle(Color color, double lineWidth, Point center, double base) {
        this(color, lineWidth, center);
        this.base = base;
    }

    private double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    void draw(GraphicsContext gc) {

    }
}


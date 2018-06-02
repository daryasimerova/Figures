import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

class Rectangle extends Figures {
    private Rectangle(Color color, double lineWidth, Point center) {
        super(color, lineWidth, FIGURE_TYPE_RECTANGLE, center);
    }

    public Rectangle(Color color, double lineWidth, Point center, double a, double b) {
        this(color, lineWidth, center);
        this.a = a;
        this.b = b;
    }

    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    void draw(GraphicsContext gc) {

    }

}


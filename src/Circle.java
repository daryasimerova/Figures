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
        photoName ="circle.png";
    }

    @Override
    public void printFigure() {
        System.out.println("  * ^ * ");
        System.out.println(" *     *");
        System.out.println("  * _ *");
    }

    @Override
    public void calculateAndShowSquare() {

        square = (int)(3.14*radius*radius);
        System.out.println("square of Circle = " + square + " mm2");
    }

    @Override
    public void showFormulaOfSquare() {
        System.out.println("Square of Circle = 3.14*radius^2.");
    }

    @Override
    public String getInformation() {
        String str =
//        "  * ^ * " + "\n"+
//        " *     *" + "\n"+
//        "  * _ * " + "\n"+
                "Input data : Radius = " + radius + "\n"+
                        "square of Circle = " + square + " mm2" + "\n"+
                        "Square of Circle = 3.14*radius^2." + "\n";
        return str;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setLineWidth(lineWidth);
        graphicsContext.setStroke(color);
        graphicsContext.strokeOval(center.x- radius, center.y - radius, radius*2, radius*2);

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

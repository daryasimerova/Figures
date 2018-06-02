import javafx.scene.canvas.GraphicsContext;

class Square extends Figures {
    private int a;
    private int perimeter;

    public Square(String color, int square, int a, int perimeter) {
        super(color, square);
        this.a = a;
        this.perimeter = perimeter;

    }

    @Override
    void draw(GraphicsContext gc) {

    }
}

package com.dsimerova.figuresfx.geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Figure {
    private Rectangle(Color color, double lineWidth, Point center) {
        super(color, lineWidth, FIGURE_TYPE_RECTANGLE, center);
    }

    public Rectangle(double lineWidth, Color color, Point center, double a, double b) {
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
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(lineWidth);
        gc.setStroke(color);
        gc.strokeRect(center.x-a/2, center.y - b/2, a, b);

    }

}


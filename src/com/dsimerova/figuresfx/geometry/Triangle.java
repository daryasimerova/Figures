package com.dsimerova.figuresfx.geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Figure{
    public Triangle(Color color, double lineWidth, Point center) {
        super(color, lineWidth, FIGURE_TYPE_TRIANGLE, center);
    }

    public Triangle(double lineWidth, Color color, Point center, double base) {
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
    public void draw(GraphicsContext gc) {
        gc.setLineWidth(lineWidth);
        gc.setStroke(color);
        double h = Math.sqrt(base*base - base*base/4);
        double [] xs = {center.x - base/2 , center.x , center.x + base/2};
        double [] ys = {center.y +h/2, center.y - h/2, center.y + h/2};
        gc.strokePolygon(xs, ys, 3);

    }
}


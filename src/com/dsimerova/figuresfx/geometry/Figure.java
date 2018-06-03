package com.dsimerova.figuresfx.geometry;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Figure {
    protected Color color;
    protected double lineWidth;
    private int type;
    Point center;


    public Figure(Color color, double lineWidth, int type, Point center) {
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

    public abstract void draw(GraphicsContext gc);

    public static final int FIGURE_TYPE_RECTANGLE = 0;
    public static final int FIGURE_TYPE_CIRCLE = 1;
    public static final int FIGURE_TYPE_TRIANGLE = 2;

}

package com.dsimerova.figuresfx.controller;

import com.dsimerova.figuresfx.geometry.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {
    @FXML
    private Canvas canvas;
    private Figure[] figures;
    private Random rmd;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        figures = new Figure[1];
        rmd = new Random(System.currentTimeMillis());
    }

    private Figure createFigure(Point point) {

        Figure figure = null;

        switch (rmd.nextInt(3)) {

            case Figure.FIGURE_TYPE_RECTANGLE:
                figure = new Rectangle(rmd.nextInt(5),
                        Color.FUCHSIA,
                        point,
                        rmd.nextInt(100),
                        rmd.nextInt(100));
                break;

            case Figure.FIGURE_TYPE_TRIANGLE:
                figure = new Triangle(rmd.nextInt(5),
                        Color.DARKCYAN,
                        point,
                        rmd.nextInt(100));
                break;

            case Figure.FIGURE_TYPE_CIRCLE:
                figure = new Circle(rmd.nextInt(5), Color.GREENYELLOW, point, rmd.nextInt(100));
                break;

            default:
                System.out.println("Unknown Figure type !!!");
        }


        return figure;
    }

    private void addFigure(Figure figure) {

        if (figures == null) return;
        if (figures[figures.length - 1] == null) {
            figures[figures.length - 1] = figure;
        } else {
            Figure[] tmp = new Figure[figures.length + 1];
            int index = 0;
            for (; index < figures.length; index++) {
                tmp[index] = figures[index];
            }
            tmp[index] = figure;
            figures = tmp;
        }


    }


    private void rePaint() {

        canvas.getGraphicsContext2D().clearRect(0, 0, 1024, 600);
        for (Figure figure : figures) {
            if (figure != null) {
                figure.draw(canvas.getGraphicsContext2D());
            }
        }


    }

    @FXML
    private void canvasClicked(MouseEvent event) {
        System.out.println("X = " + event.getX() + ", Y = " + event.getY());
        Point point = new Point(event.getX(), event.getY());
        Figure figure = createFigure(point);
        addFigure(figure);
        rePaint();


    }


}

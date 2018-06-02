package controller;

import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreenController implements Initializable {
    public Canvas canvas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void canvasClicked(MouseEvent mouseEvent) {
        System.out.println("X = " + mouseEvent.getX());
        System.out.println("Y = " + mouseEvent.getY());
    }
}

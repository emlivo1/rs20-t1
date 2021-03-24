package sample;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller {
    public Label labela;
    public GridPane back;
    public void sayhello(ActionEvent actionEvent) {
        labela.setText("Hello World!");
        back.setStyle("-fx-background-color:red");

    }
}

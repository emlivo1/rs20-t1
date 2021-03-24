package sample;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Controller {
    public Label labela;
    public void sayhello(ActionEvent actionEvent) {
        labela.setText("Hello World!");

    }
}

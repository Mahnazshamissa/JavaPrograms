package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class Controller {
    @FXML private TextField feeling;
    public void sayMahnazFeeling(ActionEvent actionEvent) {
        System.out.printf("Mahnaz feels %s! %n",feeling.getText());
    }
}

package choice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ChoiceController implements Initializable {
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private Label label;
    private String[] choices = {"Data", "Saba", "Luka", "Sophio", "Lexo"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().addAll(choices);
//        choiceBox.setOnAction(event -> getName(event));
    }

    public void getName(ActionEvent event) {
        label.setText(choiceBox.getValue());
    }
}

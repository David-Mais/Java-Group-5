package alcohol;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AlcoholController {
    @FXML
    private Label statusLabel;
    @FXML
    private TextField ageTextField;

    public void order(ActionEvent event) {
        try {
            int age = Integer.parseInt(ageTextField.getText());
            statusLabel.setStyle("-fx-text-fill: black");
            if (age < 18) {
                statusLabel.setText("პატარა ხარ!");
            } else {
                statusLabel.setText("ინებეთ!");
            }
        } catch (Exception e) {
            statusLabel.setStyle("-fx-text-fill: red");
            statusLabel.setText("!!!შეიყვანე სწორი ასაკი!!!");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("არასწორი ფორმატის ასაკი");
            alert.showAndWait();
        }
    }
}

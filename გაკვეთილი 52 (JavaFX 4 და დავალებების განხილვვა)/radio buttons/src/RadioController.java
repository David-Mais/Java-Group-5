import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class RadioController {
    @FXML
    private Label label;
    @FXML
    private RadioButton choiceA, choiceB, choiceC;

    public void pick(ActionEvent event) {
        if (choiceA.isSelected()) {
            label.setText("არასწორია!!!");
        } else if (choiceB.isSelected()) {
            label.setText("არ არის სწორი!");
        } else if (choiceC.isSelected()) {
            label.setText("სწორია :)");
        }
        choiceA.setDisable(true);
        choiceB.setDisable(true);
        choiceC.setDisable(true);
    }
}

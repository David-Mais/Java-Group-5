package quit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class QuitController {
    @FXML
    private AnchorPane background;


    public void quit(ActionEvent event) {
        Alert alert = new Alert(
                Alert.AlertType.CONFIRMATION
        );
        alert.setTitle("Quit");
        alert.setHeaderText("თქვენ თიშავთ აპლიკაციას!");
        alert.setContentText("დარწმუნებული ხარ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            Stage stage = (Stage) background.getScene().getWindow();
            stage.close();
        }
    }
}

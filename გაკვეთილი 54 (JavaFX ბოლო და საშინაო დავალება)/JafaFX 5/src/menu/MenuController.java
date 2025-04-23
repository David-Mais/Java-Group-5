package menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MenuController {
    @FXML
    private AnchorPane back;

    public void exit(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit");
        alert.setHeaderText("Are you sure you want to exit?");
        alert.setContentText("Click OK to exit");

        if (alert.showAndWait().get() == ButtonType.OK) {
//            System.exit(0);
            ((Stage) back.getScene().getWindow()).close();
        }
    }
}

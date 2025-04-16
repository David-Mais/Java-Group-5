package progress;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ProgressController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private ProgressBar progressBar;

    private double state;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setStyle("-fx-accent: green");
    }

    public void load(ActionEvent event) {
        if (state >= 0.98) {
            return;
        }
        state += 0.1;
        progressBar.setProgress(state);
        label.setText(Math.round(state * 100) + " %");
    }
}

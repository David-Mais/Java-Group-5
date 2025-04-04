package login;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GreetController {
    @FXML
    private Label greetLabel;

    public void greet(String username) {
        greetLabel.setText("გამარჯობა: " + username);
    }
}
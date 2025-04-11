package davaleba3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class JumpController {
    @FXML
    private Button jumpButton;
    @FXML
    private AnchorPane background;

    public void jump() {
        Random rand = new Random();
        int x = rand.nextInt((int) (background.getWidth() - jumpButton.getWidth()));
        int y = rand.nextInt((int) (background.getHeight() - jumpButton.getHeight()));
        jumpButton.setLayoutX(x);
        jumpButton.setLayoutY(y);
    }
}

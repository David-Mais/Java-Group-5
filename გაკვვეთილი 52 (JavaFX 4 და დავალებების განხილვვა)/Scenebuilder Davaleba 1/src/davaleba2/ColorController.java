package davaleba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class ColorController {
    @FXML
    private AnchorPane background;

    public void change(ActionEvent event) {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        background.setStyle(
                String.format("-fx-background-color: rgb(%d, %d, %d);", r, g, b)
        );
    }
}

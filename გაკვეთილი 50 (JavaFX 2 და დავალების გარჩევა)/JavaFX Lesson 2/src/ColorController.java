import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class ColorController {
    @FXML
    private AnchorPane background;

    public void changeColor() {
//        background.setStyle("-fx-background-color: green;");
//        background.setStyle("-fx-background-color: #695d45;");
        background.setStyle("-fx-background-color: rgb(150, 155, 155);");
    }
}

package light;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LightController {
    @FXML
    private ImageView imageView;
    @FXML
    private Label status;
    @FXML
    private CheckBox switchCheckbox;

    private Image on = new Image(
            getClass().getResourceAsStream("/light/on.png")
    );
    private Image off = new Image(
            getClass().getResourceAsStream("/light/off.png")
    );

    public void toggle(ActionEvent event) {
        System.out.println(switchCheckbox);
        if (switchCheckbox.isSelected()) {
            imageView.setImage(on);
            status.setText("ON");
        } else {
            imageView.setImage(off);
            status.setText("OFF");
        }
    }
}

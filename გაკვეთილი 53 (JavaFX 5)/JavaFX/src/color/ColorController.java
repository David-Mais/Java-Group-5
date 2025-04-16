package color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.awt.*;

public class ColorController {
    @FXML
    private ColorPicker colorPicker;
    @FXML
    AnchorPane background;

    public void changeColor(ActionEvent event) {
        System.out.println(colorPicker.getValue());
        Color c = colorPicker.getValue();
//        background.setBackground(
//                new Background(
//                        new BackgroundFill(c, null, null)
//                )
//        );

        int red = (int) (c.getRed() * 255);
        int green = (int) (c.getGreen() * 255);
        int blue = (int) (c.getBlue() * 255);
        background.setStyle(String.format("-fx-background-color: rgb(%d, %d, %d);", red, green, blue));
    }
}

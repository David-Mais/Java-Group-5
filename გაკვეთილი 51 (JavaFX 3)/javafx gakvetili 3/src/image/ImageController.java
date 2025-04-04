package image;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {
    @FXML
    private ImageView imageView;

    private final Image[] images = {
            new Image(getClass().getResourceAsStream("/image/candy.png")),
            new Image(getClass().getResourceAsStream("/image/death.png")),
            new Image(getClass().getResourceAsStream("/image/dracula.png")),
            new Image(getClass().getResourceAsStream("/image/halloween.png"))
    };
    private int pointer;

    public void next(ActionEvent event) {
        imageView.setImage(getNextImage());
    }

    public void previous(ActionEvent event) {
        imageView.setImage(getPreviousImage());
    }

    private Image getPreviousImage() {
        pointer--;
        if (pointer < 0) {
            pointer = images.length - 1;
        }
        return images[pointer];
    }

    public Image getNextImage() {
        pointer++;
        if (pointer == images.length) {
            pointer = 0;
        }
        return images[pointer];
    }
}

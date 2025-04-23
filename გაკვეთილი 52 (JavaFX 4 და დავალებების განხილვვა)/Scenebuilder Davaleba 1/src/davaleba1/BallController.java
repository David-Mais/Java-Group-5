package davaleba1;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallController {
    @FXML
    private Circle circle;

    private Color[] colors = {Color.BLUEVIOLET, Color.SADDLEBROWN, Color.NAVAJOWHITE, Color.OLDLACE};
    private int pointer;

    public void color() {
        if (pointer >= colors.length) {
            pointer = 0;
        }
        circle.setFill(colors[pointer++]);
    }
    public void up() {
        circle.setCenterY(
                circle.getCenterY() - 10
        );
    }

    public void down() {
        circle.setCenterY(
                circle.getCenterY() + 10
        );
    }

    public void left() {
        circle.setCenterX(
                circle.getCenterX() - 10
        );
    }

    public void right() {
        circle.setCenterX(
                circle.getCenterX() + 10
        );
    }

    public void topRight() {
        circle.setCenterY(
                circle.getCenterY() - 10
        );
        circle.setCenterX(
                circle.getCenterX() + 10
        );
    }

    public void bottomRight() {
        circle.setCenterY(
                circle.getCenterY() + 10
        );
        circle.setCenterX(
                circle.getCenterX() + 10
        );
    }

    public void bottomLeft() {
        circle.setCenterY(
                circle.getCenterY() + 10
        );
        circle.setCenterX(
                circle.getCenterX() - 10
        );
    }

    public void topLeft() {
        circle.setCenterY(
                circle.getCenterY() - 10
        );
        circle.setCenterX(
                circle.getCenterX() - 10
        );
    }
}

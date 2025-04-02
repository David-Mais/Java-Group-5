import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class CircleController {
    @FXML
    private Circle myGameCircle;

    public void up() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() - 10);
        System.out.println("Up");
    }

    public void down() {
        myGameCircle.setCenterY(myGameCircle.getCenterY() + 10);
        System.out.println("Down");
    }

    public void left() {
        myGameCircle.setCenterX(myGameCircle.getCenterX() - 10);
        System.out.println("Left");
    }

    public void right() {
        myGameCircle.setCenterX(myGameCircle.getCenterX() + 10);
        System.out.println("Right");
    }
}

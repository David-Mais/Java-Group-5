import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    public void switchToSceneTwo(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(
                getClass().getResource("scene2.fxml")
        );
        Scene scene = new Scene(root);

        Stage stage = (Stage) ( (Node) event.getSource() ).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSceneOne(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(
                getClass().getResource("scene1.fxml")
        );
        Scene scene = new Scene(root);

        Stage stage = (Stage) ( (Node) event.getSource() ).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

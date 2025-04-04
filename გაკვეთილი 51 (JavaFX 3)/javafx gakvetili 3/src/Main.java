import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // 1
//        Parent root = FXMLLoader.load(
//                getClass().getResource("login/login.fxml")
//        );
        // 2
//        Parent root = FXMLLoader.load(
//                getClass().getResource("quit/quit.fxml")
//        );
//        stage.setOnCloseRequest(event -> {
//            event.consume();
//            quit(stage);
//        });
        // 3
//        Parent root = FXMLLoader.load(
//                getClass().getResource("image/image.fxml")
//        );
        // 4
//        Parent root = FXMLLoader.load(
//                getClass().getResource("alcohol/alcohol.fxml")
//        );
        // 5
        Parent root = FXMLLoader.load(
                getClass().getResource("light/light.fxml")
        );
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public void quit(Stage stage) {
        Alert alert = new Alert(
                Alert.AlertType.CONFIRMATION
        );
        alert.setTitle("Quit");
        alert.setHeaderText("თქვენ თიშავთ აპლიკაციას!");
        alert.setContentText("დარწმუნებული ხარ?");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage.close();
        }
    }
}
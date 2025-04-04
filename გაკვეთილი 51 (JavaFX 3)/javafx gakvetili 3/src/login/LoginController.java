package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private TextField usernameTextField;

    public void login(ActionEvent event) throws Exception {
        String username = usernameTextField.getText();
        System.out.println(username);

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("greet.fxml")
        );
        Parent root = loader.load();

        GreetController greetController = loader.getController();
        greetController.greet(username);

        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}

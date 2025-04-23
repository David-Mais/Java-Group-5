package list;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    @FXML
    private ListView<String> listView;
    @FXML
    private Label label;

    private final String[] cars = {
            "Mercedes",
            "BMW",
            "Honda",
            "Audi",
            "Ford",
            "Pagani",
            "Subaru",
            "Nissan",
            "Opel",
            "Tesla"
    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(cars);

        listView
                .getSelectionModel()
                .selectedItemProperty()
                .addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        System.out.println("Old Value: " + s);
                        System.out.println("New Value: " + t1);

//                        label.setText(t1);
                        label.setText(
                                listView.getSelectionModel().getSelectedItem()
                        );
                    }
                });
    }
}

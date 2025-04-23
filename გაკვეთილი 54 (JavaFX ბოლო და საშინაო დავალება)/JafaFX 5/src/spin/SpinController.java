package spin;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.css.converter.StringConverter;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.DoubleStringConverter;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;


public class SpinController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private Spinner<Double> spinner;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory.DoubleSpinnerValueFactory dsf =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(
                        0.0,
                        Double.MAX_VALUE,
                        0.55,
                        2.75
                );
        // a filter that allows an optional leading minus,
        // any number of digits, and at most one decimal point
        Pattern validDouble = Pattern.compile("-?\\d*(\\.\\d*)?");
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String text = change.getControlNewText();
            return validDouble.matcher(text).matches() ? change : null;
        };

        TextFormatter<Double> formatter = new TextFormatter<>(
                new DoubleStringConverter(), 0.0, filter);

        spinner.getEditor().setTextFormatter(formatter);

        // when the text becomes a valid number, push it into the spinner value:
        formatter.valueProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                spinner.getValueFactory().setValue(newVal);
            }
        });


        spinner.setValueFactory(dsf);
        label.setText(spinner.getValue().toString());

        spinner
                .valueProperty()
                .addListener(
                        new ChangeListener<Double>() {
                            @Override
                            public void changed(ObservableValue<? extends Double> observableValue, Double aDouble, Double t1) {
                                label.setText(spinner.getValue().toString());
                            }
                        }
                );
    }
}

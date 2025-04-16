package date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateController {
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label label;

    public void getDate(ActionEvent event) {
        System.out.println(datePicker.getValue());
//        label.setText(datePicker.getValue().toString());
//        label.setText(datePicker.getValue().toString().replaceAll("-", " / "));
        LocalDate localDate = datePicker.getValue();
        String formattedDate = localDate.format(DateTimeFormatter.ofPattern("dd / MMM / yyyy"));
        label.setText(formattedDate);
    }
}

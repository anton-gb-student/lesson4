package chatWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    public TextArea mainWindow;
    @FXML
    public TextArea inputField;

    public void inputSend (KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER && event.isControlDown()) {
            mainWindow.appendText(inputField.getText() + "\n");
            inputField.clear();
        }
    }

    public void mnuSend(ActionEvent actionEvent) {
        mainWindow.appendText(inputField.getText() + "\n");
        inputField.clear();
    }

    public void mnuQuote(ActionEvent actionEvent) {
        String t = mainWindow.getSelectedText();
        inputField.appendText(">> " + t);
    }

    public void smileEmo(ActionEvent actionEvent) {
        inputField.appendText(":-)");
    }

    public void sadEmo(ActionEvent actionEvent) {
        inputField.appendText(":-(");
    }

    public void crazyEmo(ActionEvent actionEvent) {
        inputField.appendText("%)");
    }
}

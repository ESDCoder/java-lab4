package xyz.esdcoder.lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class ParallelogramController {

    @FXML
    private TextField sideAField;

    @FXML
    private TextField sideBField;

    @FXML
    private TextField alphaField;

    @FXML
    private Label resultLabel;

    @FXML
    private void handleCalculate() {
        try {
            double a = Double.parseDouble(sideAField.getText());
            double b = Double.parseDouble(sideBField.getText());
            double alpha = Double.parseDouble(alphaField.getText());

            double result = Calculator.calculateParallelogramArea(a, b, alpha);
            resultLabel.setText(String.format("Result: %.2f", result));
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        }
    }

    @FXML
    private void handleNewCalculation() {
        sideAField.clear();
        sideBField.clear();
        alphaField.clear();
        resultLabel.setText("Result: ");
    }

    @FXML
    private void handleSave() {
        System.out.println("Saving calculation results...");
    }

    @FXML
    private void handleExit() {
        System.exit(0);
    }

    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Program");
        alert.setHeaderText("Parallelogram Calculator");
        alert.setContentText("Version 1.0 - Developed for the Lab 1 task.");
        alert.showAndWait();
    }
}

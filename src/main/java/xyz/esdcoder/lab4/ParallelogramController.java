package xyz.esdcoder.lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Controller class for the Parallelogram Calculator's view.
 * Handles user interactions such as calculations, saving results, and navigation.
 */
public class ParallelogramController {

    /**
     * Input field for side 'a'.
     */
    @FXML
    private TextField sideAField;

    /**
     * Input field for side 'b'.
     */
    @FXML
    private TextField sideBField;

    /**
     * Input field for angle 'alpha'.
     */
    @FXML
    private TextField alphaField;

    /**
     * Label to display the calculation result.
     */
    @FXML
    private Label resultLabel;

    /**
     * Handles the calculation of the parallelogram area based on user input.
     * Updates the result label and handles errors for invalid inputs.
     */
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

    /**
     * Clears all input fields and the result label for a new calculation.
     */
    @FXML
    private void handleNewCalculation() {
        sideAField.clear();
        sideBField.clear();
        alphaField.clear();
        resultLabel.setText("Result: ");
    }

    /**
     * Saves the current calculation result to a file named 'result.txt' in the project root.
     */
    @FXML
    private void handleSave() {
        try {
            double a = Double.parseDouble(sideAField.getText());
            double b = Double.parseDouble(sideBField.getText());
            double alpha = Double.parseDouble(alphaField.getText());
            
            double result = Calculator.calculateParallelogramArea(a, b, alpha);
            Calculator.saveResult(String.format("Area: %.2f", result));
            resultLabel.setText("Result saved to result.txt");
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid input");
        } catch (IOException e) {
            resultLabel.setText("Error: Could not save file");
            e.printStackTrace();
        }
    }

    /**
     * Exits the application.
     */
    @FXML
    private void handleExit() {
        System.exit(0);
    }

    /**
     * Displays an information alert about the program.
     */
    @FXML
    private void handleAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About Program");
        alert.setHeaderText("Parallelogram Calculator");
        alert.setContentText("Version 1.0 - Developed for the Lab 1 task.");
        alert.showAndWait();
    }
}
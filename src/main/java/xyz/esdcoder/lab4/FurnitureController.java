package xyz.esdcoder.lab4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import xyz.esdcoder.lab4.Mebel;

/**
 * Controller for the Furniture Calculation view.
 */
public class FurnitureController {

    @FXML
    private TextField furnitureTypeField;
    @FXML
    private TextField materialField;
    @FXML
    private TextField pricePerCubicField;
    @FXML
    private TextField dimensionsField;
    @FXML
    private Label costLabel;

    /**
     * Handles the cost calculation for furniture.
     */
    @FXML
    private void handleCalculate() {
        try {
            double pricePerCubic = Double.parseDouble(pricePerCubicField.getText());
            double dimensions = Double.parseDouble(dimensionsField.getText());
            
            // Example logic: Simplified calculation as per requirements
            // In a real app, this would use Mebel classes.
            double cost = pricePerCubic * dimensions;
            
            costLabel.setText("Cost: " + String.format("%.2f", cost));
            
        } catch (NumberFormatException e) {
            showAlert("Input Error", "Please enter valid numbers for price and dimensions.");
        }
    }

    /**
     * Prints basic information about the furniture.
     */
    @FXML
    private void handlePrintInfo() {
        String info = "Type: " + furnitureTypeField.getText() +
                      "\nMaterial: " + materialField.getText() +
                      "\nDimensions: " + dimensionsField.getText();
        showAlert("Furniture Info", info);
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}

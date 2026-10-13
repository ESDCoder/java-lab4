package xyz.esdcoder.lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main application class for the Parallelogram Calculator.
 * It initializes the primary stage and loads the FXML view.
 */
public class ParallelogramApplication extends Application {
    /**
     * Starts the JavaFX application.
     * Loads the FXML file and sets up the scene.
     *
     * @param stage The primary stage for the application.
     * @throws IOException If there is an error loading the FXML file.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ParallelogramApplication.class.getResource("parallelogram-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Parallelogram Calculator");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main entry point for the application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
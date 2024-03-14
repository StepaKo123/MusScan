package organ.musicscanner;

import javafx.application.Application;
import javafx.stage.Stage;

import organ.musicscanner.controllers.MusicScannerController;

public class MusicScanner extends Application {
    @Override
    public void start(Stage primaryStage) {
        MusicScannerController controller = new MusicScannerController(primaryStage);
        controller.init();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
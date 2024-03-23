package organ.musicscanner;

import javafx.application.Application;
import javafx.stage.Stage;

import organ.musicscanner.controllers.StartController;

public class MusicScanner extends Application {
    @Override
    public void start(Stage primaryStage) {
        Starter.init(primaryStage);
        Starter.startStart();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
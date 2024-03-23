package organ.musicscanner.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import organ.musicscanner.views.StartView;

public class StartController {

    private Stage primaryStage;
    private StartView startView;

    public StartController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void init() {
        StartView view = new StartView(primaryStage);
        Scene scene = new Scene(view.createLayout(), 800, 500);

        primaryStage.setTitle("Start Controller");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
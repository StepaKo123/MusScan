package organ.musicscanner.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import organ.musicscanner.views.MusicScannerView;

public class MusicScannerController {
    private final Stage primaryStage;

    public MusicScannerController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void init() {
        MusicScannerView view = new MusicScannerView();
        view.setController(this);

        Scene scene = new Scene(view.createLayout(), 800, 500);
        primaryStage.setTitle("Convert Audio");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processAudio(String filePath, String key, String timeSignature) {
        Thread audioProcessingThread = new Thread(() -> {

        });
        audioProcessingThread.start();
    }
}


package organ.musicscanner.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import organ.musicscanner.views.PDFScannerView;

public class PDFScannerController {
    private final Stage primaryStage;

    public PDFScannerController(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void init() {
        PDFScannerView view = new PDFScannerView();

        Scene scene = new Scene(view.createLayout(), 800, 500);
        primaryStage.setTitle("Convert PDF");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processAudio(String filePath, String key, String timeSignature) {
        Thread audioProcessingThread = new Thread(() -> {

        });
        audioProcessingThread.start();
    }
}

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
        primaryStage.setTitle("Music Scanner");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void processAudio(String filePath, String key, String timeSignature) {
        // Создайте и запустите поток для обработки аудио
        Thread audioProcessingThread = new Thread(() -> {
            // Здесь вызовите сторонние функции для обработки аудио
            // Например:
            // AudioProcessor.process(filePath, key, timeSignature);
            // После завершения обработки, вы можете обновить GUI или выполнить другие действия
        });
        audioProcessingThread.start();
    }
}


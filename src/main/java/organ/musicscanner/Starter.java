package organ.musicscanner;

import javafx.stage.Stage;
import organ.musicscanner.controllers.MusicScannerController;
import organ.musicscanner.controllers.PDFScannerController;
import organ.musicscanner.controllers.StartController;

public class Starter {
    private static Stage primaryStage;
    private static  StartController startController;
    private static MusicScannerController musicScannerController;
    private static PDFScannerController pdfScannerController;

    private Starter() {}

    public static void init(Stage stage) {
        primaryStage = stage;
        musicScannerController = new MusicScannerController(primaryStage);
        pdfScannerController = new PDFScannerController(primaryStage);
        startController = new StartController(primaryStage);
    }

    public static void startStart(){
        startController.init();
    }
    public static void startMusic(){
        musicScannerController.init();
    }
    public static void startPdf(){
        pdfScannerController.init();
    }
}

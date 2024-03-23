package organ.musicscanner.views;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import organ.musicscanner.Starter;
import organ.musicscanner.controllers.MusicScannerController;
import organ.musicscanner.controllers.PDFScannerController;
import organ.musicscanner.controllers.StartController;

public class StartView {
    private Stage primaryStage;

    public StartView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public VBox createLayout() {
        Label greetingLabel = new Label("Добро пожаловать!");

        Button musicScannerButton = new Button("Аудио -> Ноты");
        Button pdfScannerButton = new Button("Ноты -> Аудио");
        musicScannerButton.setOnAction(this::handleMusicScannerButton);
        pdfScannerButton.setOnAction(this::handlePDFScannerButton);

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        root.getChildren().addAll(greetingLabel, musicScannerButton, pdfScannerButton);
        return root;
    }

    private void handleMusicScannerButton(ActionEvent event) {
        Starter.startMusic();
    }
    private void handlePDFScannerButton(ActionEvent event) {
        Starter.startPdf();
    }
}
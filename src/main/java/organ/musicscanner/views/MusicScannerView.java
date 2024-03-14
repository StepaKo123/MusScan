package organ.musicscanner.views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import java.io.File;

import javafx.scene.web.WebView;
import javafx.stage.FileChooser;
import organ.musicscanner.controllers.MusicScannerController;
import organ.musicscanner.services.FileInputService;

public class MusicScannerView {

    private MusicScannerController controller;
    private TextField keyField;
    private TextField timeSignatureField;

    public void setController(MusicScannerController controller) {
        this.controller = controller;
    }

    public VBox createLayout() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        Label fileLabel = new Label("Ввод аудио файла");
        Button browseButton = new Button("Выберите файл");
        Label statusLabel = new Label(" ");
        Label optionsLabel = new Label("Параметры:");
        keyField = new TextField();
        keyField.setPromptText("Тональность");
        timeSignatureField = new TextField();
        timeSignatureField.setPromptText("Размер такта");

        browseButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Выберите файл");
            File selectedFile = fileChooser.showOpenDialog(browseButton.getScene().getWindow());
            if (selectedFile != null) {
                System.out.println("Информация о файле:");
                System.out.println("Путь: " + selectedFile.getAbsolutePath());
                System.out.println("Размер: " + selectedFile.length() + " байт");
                System.out.println("Расширение: " + getFileExtension(selectedFile));

                if (FileInputService.isPDF(selectedFile)) {
                    statusLabel.setText("Файл успешно загружен");
                    browseButton.setText(selectedFile.getName());
                } else {
                    statusLabel.setText(selectedFile.getAbsolutePath());
                }
            }
        });


        root.getChildren().addAll(fileLabel, browseButton, optionsLabel, keyField, timeSignatureField, statusLabel);

        return root;
    }
    private String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOfDot = name.lastIndexOf(".");
        if (lastIndexOfDot != -1 && lastIndexOfDot != 0) {
            return name.substring(lastIndexOfDot + 1);
        } else {
            return "";
        }
    }
}

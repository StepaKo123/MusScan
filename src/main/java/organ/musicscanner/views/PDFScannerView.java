package organ.musicscanner.views;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import organ.musicscanner.Starter;
import organ.musicscanner.controllers.PDFScannerController;
import organ.musicscanner.controllers.StartController;
import organ.musicscanner.xml_to_pdf.PDFConverter;

import java.io.File;

public class PDFScannerView {
    private PDFScannerController controller;
    private TextField keyField;
    private TextField timeSignatureField;
    private StartController startController;
    private Stage stage;

    public void setController(PDFScannerController controller) {
        this.controller = controller;
    }
    public VBox createLayout() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.setAlignment(Pos.CENTER);
        Label fileLabel = new Label("Ввод PDF файла");
        Button browseButton = new Button("Выберите файл");
        Label statusLabel = new Label(" ");
        Label optionsLabel = new Label("Параметры:");
        keyField = new TextField();
        keyField.setPromptText("Тональность");
        timeSignatureField = new TextField();
        timeSignatureField.setPromptText("Размер такта");
        Button backButton = new Button("Назад");
        backButton.setOnAction(this::back);

        browseButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Выберите файл");
            File selectedFile = fileChooser.showOpenDialog(browseButton.getScene().getWindow());
            if (selectedFile != null) {
                System.out.println("Информация о файле:");
                System.out.println("Путь: " + selectedFile.getAbsolutePath());
                System.out.println("Размер: " + selectedFile.length() + " байт");
                System.out.println("Расширение: " + getFileExtension(selectedFile));

                if (PDFConverter.isPDF(selectedFile)) {
                    statusLabel.setText("Файл успешно загружен");
                    browseButton.setText(selectedFile.getName());
                } else {
                    statusLabel.setText(selectedFile.getAbsolutePath());
                }
            }
        });


        root.getChildren().addAll(fileLabel, browseButton, optionsLabel, keyField, timeSignatureField, statusLabel,  backButton);

        return root;
    }
    private void back(ActionEvent event){
        Starter.startStart();
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
